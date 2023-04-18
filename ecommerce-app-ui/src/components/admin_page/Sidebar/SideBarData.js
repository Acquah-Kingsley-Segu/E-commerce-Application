// importing of icons
import * as MdIcons from "react-icons/md";

/* 
  Data for the buttons on the admin sidebar pane
*/
const SidebarData = [
  {
    title: "Dashboard",
    path: "/admin/dashboard",
    icon: <MdIcons.MdOutlineDashboard className=" text-white text-xl" />,
  },
  {
    title: "Orders",
    path: "/order",
    icon: <MdIcons.MdShoppingCart className=" text-white text-xl" />,
  },
  {
    title: "Products",
    path: "/products",
    icon: <MdIcons.MdOutlineInventory className=" text-white text-xl" />,
  },
  {
    title: "Pricing",
    path: "/pricing",
    icon: <MdIcons.MdOutlineCreditCard className=" text-white text-xl" />,
  },
  {
    title: "Analytics",
    path: "/analytics",
    icon: <MdIcons.MdOutlineAssessment className=" text-white text-xl" />,
  },
];

export default SidebarData;
