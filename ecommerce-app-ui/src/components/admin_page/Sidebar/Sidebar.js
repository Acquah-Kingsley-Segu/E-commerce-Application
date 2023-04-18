import Scrollbars from "react-custom-scrollbars-2";
import SidebarData from "./SideBarData";

/*const menu = {
  title: "Dashboard",
  path: "/dashboard",
  icon: <FaIcons.FaHome />,
  iconClosed: <MdIcons.MdKeyboardArrowRight />,
  iconOpen: <MdIcons.MdKeyboardArrowDown />,
};
*/
const Sidebar = () => {
  return (
    <Scrollbars>
      <section>
        {SidebarData.map((data, key) => (
          <button
            key={key}
            className="flex items-center my-5 w-full h-10 hover:bg-gray-700 hover:cursor-pointer focus:border-l-4 focus:border-l-sky-500"
          >
            <p className="ml-5">{data.icon}</p>
            <h3 className="ml-2 font-mono text-md text-white">{data.title}</h3>
          </button>
        ))}
      </section>
    </Scrollbars>
  );
};

export default Sidebar;
