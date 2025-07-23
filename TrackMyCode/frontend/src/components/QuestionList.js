import React from "react";

const QuestionList = ({ questions, onDelete }) => {
  return (
    <div>
      <h2>Questions List</h2>
      <ul>
        {questions.map((q) => (
          <li key={q.id}>
            <strong>{q.title}</strong> | {q.difficulty} | {q.topic} | {q.timeTaken} min
            <button onClick={() => onDelete(q.id)}>❌</button>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default QuestionList;
