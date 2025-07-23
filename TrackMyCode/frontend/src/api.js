// src/api.js

import axios from "axios";

const BASE_URL = "http://localhost:8080/api/questions";

export const getQuestions = () => axios.get(BASE_URL);
export const addQuestion = (data) => axios.post(BASE_URL, data);
export const updateQuestion = (id, data) => axios.put(`${BASE_URL}/${id}`, data);
export const deleteQuestion = (id) => axios.delete(`${BASE_URL}/${id}`);
// This file contains API functions to interact with the backend.
// It uses axios to make HTTP requests to the backend server for CRUD operations on questions.