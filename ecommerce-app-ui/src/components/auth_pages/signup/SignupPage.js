import { useState } from "react";
import { useNavigate } from "react-router-dom";
import Authetication from "../../../services/Authetication";
import "./signup.css";

const SignupPage = () => {
  const [userInfo, setUserInfo] = useState({
    name: "",
    username: "",
    email: "",
    password: "",
    status: 1,
  });

  const navigate = useNavigate();

  const submitUser = (event) => {
    event.preventDefault();
    console.log(userInfo);
    Authetication.createUser(userInfo)
      .then((response) => {
        console.log(response);
        navigate("/");
      })
      .catch((error) => console.log(error));
  };

  const inputHandlerChange = (event) => {
    setUserInfo({ ...userInfo, [event.target.name]: event.target.value });
  };
  return (
    <div className="flex justify-center items-center signupBackground w-screen h-screen">
      <div className="w-1/3 h-1/2 flex flex-col">
        <div className="text-center font-mono text-black text-2xl">
          <h3>Create an Account</h3>
        </div>
        <div>
          <input
            className="bg-cyan-100 rounded-full p-2 w-11/12 mx-3 mb-3"
            name="name"
            value={userInfo.name}
            type="text"
            onChange={inputHandlerChange}
            placeholder="Name"
          />
        </div>
        <div>
          <input
            className="bg-cyan-100 rounded-full p-2 w-11/12 mx-3 mb-3"
            name="username"
            type="text"
            value={userInfo.username}
            onChange={inputHandlerChange}
            placeholder="Username"
          />
        </div>
        <div>
          <input
            className="bg-cyan-100 rounded-full p-2 w-11/12 mx-3 mb-3"
            type="text"
            name="email"
            value={userInfo.email}
            onChange={inputHandlerChange}
            placeholder="Email"
          />
        </div>
        <div>
          <input
            className="bg-cyan-100 rounded-full p-2 w-11/12 mx-3 mb-3"
            type="text"
            value={userInfo.password}
            name="password"
            onChange={inputHandlerChange}
            placeholder="Password"
          />
        </div>
        <div className="text-center">
          <button
            onClick={submitUser}
            className="bg-black text-white font-mono rounded-full p-2 w-1/2 mx-3 hover:bg-white hover:text-black"
          >
            Submit
          </button>
        </div>
        <div className="text-center">
          <a className="text-white underline hover:text-cyan-300" href="/">
            Login
          </a>
        </div>
      </div>
    </div>
  );
};

export default SignupPage;
