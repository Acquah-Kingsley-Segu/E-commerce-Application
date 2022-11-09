import React from "react";
import Navbar from "./Navbar";
import Section from "./Section";
import Sidebar from "./Sidebar";

const AdminPage = () => {
  return (
    <div className="bg-blue-500 flex flex-col h-screen">
      <div>
        <Navbar />
      </div>
      <main className="bg-red-300 flex h-full">
        <Sidebar />
        <Section />
      </main>
    </div>
  );
};

export default AdminPage;
