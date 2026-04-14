import axios from 'axios';

const api = axios.create({ baseURL: 'http://localhost:8080/ai', withCredentials: true });

export const fetchPrediction = async (prompt) => {
  const { data } = await api.post('/generate', { prompt });
  return data;
};


