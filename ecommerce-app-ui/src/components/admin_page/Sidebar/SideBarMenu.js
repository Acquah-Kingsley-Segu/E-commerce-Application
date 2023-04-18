import React from "react";
import MiniMenu from "./MiniMenu";

const SideBarMenu = ({ menu }) => {
  return (
    <nav>
      <div className={"flex justify-between mt-5 h-8 items-center w-full"}>
        <div className="flex">
          <div className="align-baseline mt-1 text-white">{menu.icon}</div>
          <p className="font-mono ml-2 font-semibold text-gray-700">
            {menu.title}
          </p>
        </div>
      </div>
      {menu.subNav && menu.subNav.length !== 0
        ? menu.subNav.map((subnav, key) => <MiniMenu menu={subnav} key={key} />)
        : null}
    </nav>
  );
};

export default SideBarMenu;
