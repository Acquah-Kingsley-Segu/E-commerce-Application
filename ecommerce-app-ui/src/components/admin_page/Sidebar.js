import React from "react";
import { FaHome, FaLayerGroup, FaStore, FaUser } from "react-icons/fa";

const Sidebar = () => {
  const menu_names = [
    { menuTab: { name: "Dashboard", component: <FaHome /> } },
    { menuTab: { name: "Category", component: <FaStore /> } },
    { menuTab: { name: "Product", component: <FaLayerGroup /> } },
    { menuTab: { name: "User", component: <FaUser /> } },
  ];
  return (
    <aside className="bg-slate-700 border-2 flex flex-col w-1/5">
      <div className="bg-blue-400 h-1/3 flex flex-col justify-center items-center">
        <div className="bg-gray-400 border-2 border-black h-16 w-16 rounded-full"></div>
        <h3>Kingsley</h3>
        <h4 className="uppercase">General Manager</h4>
      </div>
      <div>
        <nav className="flex">
          <FaHome className="align-baseline mt-1 text-white" />
          <p className="font-mono ml-2 text-white">Dashboard</p>
        </nav>
      </div>
    </aside>
  );
};

export default Sidebar;
