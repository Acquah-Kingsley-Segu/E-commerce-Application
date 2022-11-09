import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import "./login.css";

const LoginPage = () => {
  const navigate = useNavigate();

  const [loginInfo, setLoginInfo] = useState({
    username: "",
    password: "",
  });

  /*const [userInfo, setUserInfo] = useState({
    name: "",
    username: "",
    email: "",
    password: "",
    status: "",
  });*/

  const inputHandlerChange = (event) => {
    event.preventDefault();
    setLoginInfo({ ...loginInfo, [event.target.name]: event.target.value });
  };

  const submitHandler = /*async*/ (event) => {
    /*try {
      const response = await Authetication.getUserByUsername(
        loginInfo.username
      );
      console.log(response.data);
      setUserInfo({
        ...userInfo,
        name: response.data.name,
        username: response.data.username,
        email: response.data.email,
        password: response.data.password,
        status: response.data.status,
      });
      console.log(userInfo);
    } catch (error) {
      console.log(error);
    }
    userInfo.password === loginInfo.password
      ? navigate("/signup")
      : navigate("/");*/
    navigate("/admin");
  };

  return (
    <div className="flex justify-center items-center loginBackground w-screen h-screen">
      <div className="w-1/3 h-1/2 flex flex-col">
        <div className="text-center font-mono text-slate-400 text-2xl">
          <h3>Log into the Account</h3>
        </div>
        <div>
          <input
            className="bg-cyan-100 rounded-full p-2 w-11/12 mx-3 mb-3"
            name="username"
            value={loginInfo.username}
            text="text"
            placeholder="Username"
            onChange={inputHandlerChange}
          />
        </div>
        <div>
          <input
            className="bg-cyan-100 rounded-full p-2 w-11/12 mx-3 mb-3"
            type="text"
            name="password"
            value={loginInfo.password}
            placeholder="Password"
            onChange={inputHandlerChange}
          />
        </div>
        <div className="text-center">
          <button
            className="bg-cyan-500 text-white font-mono rounded-full p-2 w-1/2 mx-3 mb-5 hover:bg-white hover:text-cyan-500"
            onClick={submitHandler}
          >
            Submit
          </button>
        </div>
        <div className="ml-16">
          <a
            className="mr-3 text-blue-700 underline hover:text-cyan-300"
            href="\"
          >
            Forgot Password?
          </a>
          <a
            className="text-blue-700 underline hover:text-cyan-300 ml-5"
            href="/signup"
          >
            Create an Account
          </a>
        </div>
      </div>
    </div>
  );
};

export default LoginPage;
