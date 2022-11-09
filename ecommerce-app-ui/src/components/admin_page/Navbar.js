import React from "react";

const Navbar = () => {
  return (
    <header className="border-2 border-black flex items-center justify-between h-14 p-5">
      <div className="basis-1/6 text-2xl">
        <h1>E-Commerce Site</h1>
      </div>
      <div className="basis-3/6 font-mono">
        <input
          className="bg-gray-200 w-11/12 px-5 py-2 ml-5 rounded-full"
          type="text"
        />
      </div>
      <div className="basis-2/6 text-2xl font-mono">
        <h1>Profile Image</h1>
      </div>
    </header>
  );
};

export default Navbar;
