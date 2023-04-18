import React, { useEffect, useMemo, useState } from "react";
import { Scrollbars } from "react-custom-scrollbars-2";
import { useTable } from "react-table";
import MainCategory from "../../../services/MainCategory";

const AddMain = () => {
  const [categoryList, setCategoryList] = useState([]);
  const [categoryInfo, setCategoryInfo] = useState({
    name: "",
    description: "",
  });

  const onChange = (event) => {
    event.preventDefault();
    setCategoryInfo({
      ...categoryInfo,
      [event.target.name]: event.target.value,
    });
  };

  const onAddClick = (event) => {
    event.preventDefault();
    MainCategory.createCategory(categoryInfo).then((response) => {
      console.log(response.data);
    });
    setCategoryInfo({
      name: "",
      description: "",
    });
  };

  const onClearClick = (event) => {
    event.preventDefault();
    setCategoryInfo({
      name: "",
      description: "",
    });
  };

  useEffect(() => {
    const fetchCategory = async () => {
      try {
        const response = await MainCategory.getCategoryList();
        setCategoryList(response.data);
      } catch (error) {
        console.log(error);
      }
    };
    fetchCategory();
  }, []);

  const data = useMemo(() => categoryList, [categoryList]);
  const columns = useMemo(
    () => [
      { Header: "ID", accessor: "id" },
      { Header: "Name", accessor: "name" },
      { Header: "Description", accessor: "description" },
    ],
    []
  );

  // create the table instance
  const instanceTable = useTable({ columns, data });
  // use the table instance
  const { getTableProps, getTableBodyProps, headerGroups, rows, prepareRow } =
    instanceTable;
  return (
    <div>
      <section>
        <Scrollbars style={{ width: 1010, height: 500 }}>
          <div className="mt-8">
            <h5 className=" font-sans font-medium text-2xl pl-5 pt-3">
              Add New Main Category
            </h5>
            <p className="pl-5 text-sm">
              Provide the details demanded below to create a main category item
            </p>
          </div>

          <div className="py-2 flex justify-center mt-5">
            <div className="flex flex-col my-3 mx-10 h-2/6 px-10 rounded-lg shadow-sm shadow-gray-500 w-5/6">
              <div className="flex flex-col mt-3">
                <p className=" font-mono font-light text-sm mb-2">Name</p>
                <input
                  name="name"
                  onChange={onChange}
                  value={categoryInfo.name}
                  type="text"
                  className="bg-gray-100 rounded-lg border-2 border-gray-400 h-8 w-2/3 px-3 py-2"
                />
              </div>
              <div className="flex flex-col mt-3">
                <p className=" font-mono font-light text-sm mb-2">
                  Description
                </p>
                <textarea
                  cols={20}
                  rows={5}
                  className="bg-gray-100 rounded-lg border-2 border-gray-400  w-2/3 p-2"
                  name="description"
                  value={categoryInfo.description}
                  onChange={onChange}
                >
                  Enter category description here...
                </textarea>
              </div>
              <div className="w-1/3 h-10 m-3 text-center ml-32 flex justify-around">
                <button
                  onClick={onClearClick}
                  className="bg-red-600 w-2/5 rounded-lg border-2 border-black hover:bg-white"
                >
                  Clear
                </button>
                <button
                  onClick={onAddClick}
                  className="bg-teal-600 w-2/5 rounded-lg border-2 border-black hover:bg-white"
                >
                  Add
                </button>
              </div>
            </div>
          </div>
          <div className="bg-red-300">
            <table {...getTableProps()} className="w-full">
              <thead className="bg-slate-100 text-center">
                {headerGroups.map((headerGroup) => (
                  <tr {...headerGroup.getHeaderGroupProps()} className="">
                    {headerGroup.headers.map((column) => (
                      <th
                        {...column.getHeaderProps()}
                        className="border-r border-r-black font-sans font-medium"
                      >
                        {column.render("Header")}
                      </th>
                    ))}
                  </tr>
                ))}
              </thead>
              <tbody {...getTableBodyProps()}>
                {rows.map((row) => {
                  prepareRow(row);
                  return (
                    <tr {...row.getRowProps()}>
                      {row.cells.map((cell) => {
                        return (
                          <td
                            {...cell.getCellProps()}
                            className="font-thin text-md"
                          >
                            {cell.render("Cell")}
                          </td>
                        );
                      })}
                    </tr>
                  );
                })}
              </tbody>
            </table>
          </div>
        </Scrollbars>
      </section>
    </div>
  );
};

export default AddMain;
