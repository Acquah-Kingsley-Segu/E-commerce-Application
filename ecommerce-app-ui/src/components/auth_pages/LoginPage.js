import React from "react";
import "./login.css";

const LoginPage = () => {
  return (
    <div className="flex justify-center items-center w-screen h-screen loginBackground">
      <form className="w-1/2">
        <h3 className="text-2xl text-serif text-slate-400">
          Log into the Account
        </h3>
        <div>
          <input
            className="bg-cyan-100 h-8 w-1/2 my-5 p-5 rounded-full text-slate-300"
            text="text"
            placeholder="Username"
          />
        </div>
        <div>
          <input
            className="bg-cyan-100 h-8 w-1/2 p-5 rounded-full text-slate-300"
            type="text"
            placeholder="Password"
          />
        </div>
        <div>
          <input
            className="bg-cyan-500 h-8 w-1/3 my-5 font-mono rounded-full text-zinc-50 hover:cursor-pointer hover:bg-white hover:text-cyan-500"
            type="submit"
          />
        </div>
        <div>
          <a
            className="pr-5 text-blue-700 underline hover:text-cyan-300"
            href="\"
          >
            Forgot Password?
          </a>
          <a
            className="pl-5 text-blue-700 underline hover:text-cyan-300"
            href="\"
          >
            Create an Account
          </a>
        </div>
      </form>
    </div>
  );
};

export default LoginPage;
