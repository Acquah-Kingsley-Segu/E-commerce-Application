import { BrowserRouter, Route, Routes } from "react-router-dom";
import "./App.css";
import AdminPage from "./components/admin_page/AdminPage";
import LoginPage from "./components/auth_pages/login/LoginPage";
import SignupPage from "./components/auth_pages/signup/SignupPage";
function App() {
  //let { url, path } = useRoutes();
  return (
    <BrowserRouter>
      <Routes>
        <Route index element={<LoginPage />} />
        <Route path="/" element={<LoginPage />} />
        <Route path="/login" element={<LoginPage />} />
        <Route path="/signup" element={<SignupPage />} />
        <Route path="/admin/*" element={<AdminPage />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
