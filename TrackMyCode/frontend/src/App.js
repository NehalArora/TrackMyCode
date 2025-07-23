import React, { useEffect, useState } from "react";
import { getQuestions, addQuestion, deleteQuestion } from "./api";
import QuestionForm from "./components/QuestionForm";
import QuestionList from "./components/QuestionList";

function App() {
  const [questions, setQuestions] = useState([]);

  const fetchQuestions = async () => {
    try {
      const res = await getQuestions();
      setQuestions(res.data);
    } catch (err) {
      console.error("Failed to fetch questions:", err);
    }
  };

  const handleAdd = async (newQ) => {
    try {
      await addQuestion(newQ);
      fetchQuestions();
    } catch (err) {
      console.error("Failed to add question:", err);
    }
  };

  const handleDelete = async (id) => {
    try {
      await deleteQuestion(id);
      fetchQuestions();
    } catch (err) {
      console.error("Failed to delete question:", err);
    }
  };

  useEffect(() => {
    fetchQuestions();
  }, []);

  return (
    <div style={{ padding: "2rem" }}>
      <h1>Track My Code</h1>
      <QuestionForm onAdd={handleAdd} />
      <QuestionList questions={questions} onDelete={handleDelete} />
    </div>
  );
}

export default App;
