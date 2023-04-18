import React, { useState } from "react";
import { useNavigate } from "react-router-dom";

const MiniMenu = ({ menu }) => {
  const navigate = useNavigate();

  const [bgColor, setBgColor] = useState("");
  const showSubNav = () => {
    setBgColor("bg-teal-500 opacity-25");
    navigate(menu.path);
  };

  return (
    <>
      <nav
        onClick={showSubNav}
        className={`flex h-8 text-md mb-2 m-full ${bgColor} rounded-md hover:cursor-pointer`}
      >
        <div className="flex hover:text-blue-300 items-center ">
          <div className="align-baseline text-white">{menu.icon}</div>
          <p className="font-mono text-white">{menu.title}</p>
        </div>
      </nav>
    </>
  );
};
/*<div className="align-baseline mt-1 text-white">
          {menu.subNav && subnav
            ? menu.iconOpen
            : menu.subNav
            ? menu.iconClosed
            : null}
        </div> */
export default MiniMenu;
