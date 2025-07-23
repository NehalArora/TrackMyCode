import React, { useState } from "react";

const QuestionForm = ({ onAdd }) => {
  const [form, setForm] = useState({
    title: "",
    difficulty: "",
    topic: "",
    timeTaken: "",
    notes: ""
  });

  const handleChange = (e) => {
    setForm({ ...form, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    onAdd(form);
    setForm({
      title: "",
      difficulty: "",
      topic: "",
      timeTaken: "",
      notes: ""
    });
  };

  return (
    <form onSubmit={handleSubmit} style={{ marginBottom: "2rem" }}>
      <input name="title" placeholder="Title" value={form.title} onChange={handleChange} required />
      <input name="difficulty" placeholder="Difficulty" value={form.difficulty} onChange={handleChange} required />
      <input name="topic" placeholder="Topic" value={form.topic} onChange={handleChange} required />
      <input type="number" name="timeTaken" placeholder="Time (min)" value={form.timeTaken} onChange={handleChange} required />
      <input name="notes" placeholder="Notes" value={form.notes} onChange={handleChange} />
      <button type="submit">Add Question</button>
    </form>
  );
};

export default QuestionForm;
