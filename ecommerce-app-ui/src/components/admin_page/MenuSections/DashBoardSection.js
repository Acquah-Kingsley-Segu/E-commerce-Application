import React, { useState } from "react";
import Chart from "react-apexcharts";
import { Scrollbars } from "react-custom-scrollbars-2";
import * as FcIcons from "react-icons/fc";

const Dashboard = () => {
  const [salesChart, setSalesChart] = useState({
    options: {
      chart: {
        id: "basic-bar",
        type: "line",
      },
      xaxis: {
        categories: [
          "January",
          "February",
          "March",
          "April",
          "May",
          "June",
          "July",
          "August",
          "September",
          "October",
          "November",
          "December",
        ],
      },
    },
    series: [
      {
        name: "series-1",
        data: [30, 40, 45, 50, 49, 60, 70, 91, 20, 54, 64, 74],
      },
    ],
  });
  const [usersChart, setUsersChart] = useState({
    options: {
      series: [200, 120, 50],
      chartOptions: {
        labels: ["Customers", "Admins", "Riders"],
      },
    },
  });
  return (
    <div>
      <section>
        <Scrollbars style={{ width: 1009, height: 500 }}>
          <div>
            <h3 className=" font-sans font-semibold text-3xl pl-5 pt-3 subpixel-antialiased">
              Welcome, Kingsley
            </h3>
            <p className="pl-5 text-sm">
              Hello you can manage your store from here
            </p>
          </div>

          <div className="py-2">
            <div className="flex flex-col m-10 h-2/6 p-3 rounded-lg shadow-sm shadow-gray-500">
              <div className="flex">
                <div className=" align-baseline mt-1">
                  <FcIcons.FcBullish />
                </div>
                <p className="font-semibold pl-1">
                  Dashboard Statistics for Order
                </p>
              </div>

              <div className="flex justify-between my-5">
                <div className=" bg-blue-200 basis-1/4 mr-5 p-5 rounded-lg">
                  <FcIcons.FcLeave
                    size={30}
                    className="float-right clear-left"
                  />
                  <p className="mt-5 text-2xl font-bold text-blue-400">1</p>
                  <p className="text-sm font-semibold mb-5">
                    Unassigned orders
                  </p>
                </div>
                <div className="bg-orange-200 basis-1/4 mr-5 p-5 rounded-lg">
                  <FcIcons.FcInspection
                    size={30}
                    className="float-right clear-left"
                  />
                  <p className="mt-5 text-2xl font-bold text-orange-400">0</p>
                  <p className="text-sm font-semibold mb-5">Ongoing orders</p>
                </div>
                <div className="bg-green-200 basis-1/4 mr-5 p-5 rounded-lg">
                  <FcIcons.FcShop
                    size={30}
                    className="float-right clear-left"
                  />
                  <p className="mt-5 text-2xl font-bold text-green-400">0</p>
                  <p className="text-sm font-semibold mb-5">
                    Preparing in stores
                  </p>
                </div>
                <div className=" bg-red-200 basis-1/4 p-5 rounded-lg">
                  <FcIcons.FcShipped
                    size={30}
                    className="float-right clear-left"
                  />
                  <p className="mt-5 text-2xl font-bold text-red-400">0</p>
                  <p className="text-sm font-semibold mb-5">Picked up</p>
                </div>
              </div>

              <div className="flex justify-between">
                <div className=" bg-gray-100 flex justify-between mr-5 p-3 basis-1/4 rounded-xl items-center">
                  <div className="flex items-center">
                    <FcIcons.FcApproval className="mt-1" size={30} />
                    <p className="ml-2 font-medium">Delivered</p>
                  </div>
                  <p className="text-red-600 text-xl font-bold">3</p>
                </div>
                <div className=" bg-gray-100 flex justify-between mr-5 p-3 basis-1/4 rounded-xl items-center">
                  <div className="flex items-center">
                    <FcIcons.FcCancel className="mt-1" size={30} />
                    <p className="ml-2 font-medium">Canceled</p>
                  </div>
                  <p className="text-green-400 text-xl font-bold">3</p>
                </div>
                <div className=" bg-gray-100 flex justify-between mr-5 p-3 basis-1/4 rounded-xl items-center">
                  <div className="flex items-center">
                    <FcIcons.FcHighPriority className="mt-1" size={30} />
                    <p className="ml-2 font-medium">Payment Failed</p>
                  </div>
                  <p className="text-orange-400 text-xl font-bold">3</p>
                </div>
                <div className=" bg-gray-100 flex justify-between p-3 basis-1/4 rounded-xl items-center">
                  <div className="flex items-center">
                    <FcIcons.FcDonate className="mt-1" size={30} />
                    <p className="ml-2 font-medium">Refunded</p>
                  </div>
                  <p className="text-blue-400 text-xl font-bold">3</p>
                </div>
              </div>
            </div>
            <div className="m-10 h-2/6 p-5 rounded-lg shadow-sm shadow-gray-500">
              <div className="flex justify-center">
                <FcIcons.FcSalesPerformance className="mt-1" size={20} />
                <p className=" text-lg pl-2 font-medium">
                  Sales Performance Chart
                </p>
              </div>
              <Chart
                options={salesChart.options}
                series={salesChart.series}
                type="line"
                width="900"
                height={400}
              />
            </div>
            <div className="flex">
              <div className="shadow-sm shadow-gray-500 basis-1/2 mx-10 rounded-lg">
                <div className="flex justify-center py-3 border-b-gray-200 border-b">
                  <FcIcons.FcManager className="mt-1" size={20} />
                  <p className="text-lg pl-2 font-medium">Users Overview</p>
                </div>
                <Chart
                  options={usersChart.options}
                  series={usersChart.options.series}
                  type="donut"
                  className="py-8 px-3"
                />
              </div>
              <div className="shadow-sm shadow-gray-500 basis-1/2 mx-10 rounded-lg">
                <div className="flex justify-center py-2 border-b-gray-200 border-b">
                  <FcIcons.FcApprove className="mt-1" size={20} />
                  <p className="text-lg pl-2 font-medium">
                    Top Five Most Rated Riders
                  </p>
                </div>
                <div>
                  <div className="flex justify-between bg-slate-200 m-2 rounded-full px-5 py-2">
                    <div className="flex items-center">
                      <div className="rounded-full bg-black border w-10 h-10"></div>
                      <p className="text-lg ml-2 font-semibold text-gray-700 font-mono">
                        Mbappe Jonathan
                      </p>
                    </div>
                    <div className="flex items-center">
                      <FcIcons.FcLike size={30} />
                      <p className=" text-lg ml-2 font-extrabold text-white font-mono">
                        3
                      </p>
                    </div>
                  </div>
                  <div className="flex justify-between bg-slate-200 m-2 rounded-full px-5 py-2">
                    <div className="flex items-center">
                      <div className="rounded-full bg-black border w-10 h-10"></div>
                      <p className=" text-lg ml-2 font-semibold text-gray-700 font-mono">
                        Mbappe Jonathan
                      </p>
                    </div>
                    <div className="flex items-center">
                      <FcIcons.FcLike size={30} />
                      <p className=" text-lg ml-2 font-extrabold text-white font-mono">
                        3
                      </p>
                    </div>
                  </div>
                  <div className="flex justify-between bg-slate-200 m-2 rounded-full px-5 py-2">
                    <div className="flex items-center">
                      <div className="rounded-full bg-black border w-10 h-10"></div>
                      <p className=" text-lg ml-2 font-semibold text-gray-700 font-mono">
                        Mbappe Jonathan
                      </p>
                    </div>
                    <div className="flex items-center">
                      <FcIcons.FcLike size={30} />
                      <p className=" text-lg ml-2 font-extrabold text-white font-mono">
                        3
                      </p>
                    </div>
                  </div>
                  <div className="flex justify-between bg-slate-200 m-2 rounded-full px-5 py-2">
                    <div className="flex items-center">
                      <div className="rounded-full bg-black border w-10 h-10"></div>
                      <p className=" text-lg ml-2 font-semibold text-gray-700 font-mono">
                        Mbappe Jonathan
                      </p>
                    </div>
                    <div className="flex items-center">
                      <FcIcons.FcLike size={30} />
                      <p className=" text-lg ml-2 font-extrabold text-white font-mono">
                        3
                      </p>
                    </div>
                  </div>
                  <div className="flex justify-between bg-slate-200 m-2 rounded-full px-5 py-2">
                    <div className="flex items-center">
                      <div className="rounded-full bg-black border w-10 h-10"></div>
                      <p className=" text-lg ml-2 font-semibold text-gray-700 font-mono">
                        Mbappe Jonathan
                      </p>
                    </div>
                    <div className="flex items-center">
                      <FcIcons.FcLike size={30} />
                      <p className=" text-lg ml-2 font-extrabold text-white font-mono">
                        3
                      </p>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </Scrollbars>
      </section>
    </div>
  );
};

export default Dashboard;
