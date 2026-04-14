import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import PredictPage from './pages/PredictPage';

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<PredictPage />} />
      </Routes>
    </Router>
  );
}
export default App;


