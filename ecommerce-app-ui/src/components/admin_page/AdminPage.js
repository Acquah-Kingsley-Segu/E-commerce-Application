import { Route, Routes } from "react-router-dom";
import Dashboard from "./MenuSections/DashBoardSection";
import Navbar from "./Navbar";
import Sidebar from "./Sidebar/Sidebar";

// component responsible for pieces together the smaller components to form the admin page
const AdminPage = () => {
  return (
    <div className="flex h-screen">
      {/* logo and sidebar section on the left side */}
      <div className=" bg-gray-800 basis-3/12 flex flex-col">
        <div className="basis-1/12 border-r border-slate-500">Logo</div>
        <Sidebar />
      </div>

      {/* navbar and function display screen section on the right side */}
      <div className="basis-full flex flex-col">
        <Navbar />
        <div className="bg-white basis-full">
          <Routes>
            <Route index element={<Dashboard />} />
          </Routes>
        </div>
      </div>
    </div>
  );
};

export default AdminPage;
