import { useState } from "react";
import Addworker from "../Modal/Addworker";
import { useQuery } from "@tanstack/react-query";
const fetchData = async () => {
  const response = await fetch(
    "https://6245127ed042f081.mokky.dev/enHoroscope"
  );
  const data = await response.json();
  if (!response.ok) {
    throw new Error(data.message || "Something went wrong");
  }
  return data;
};
const WorkersPage = () => {
  const [addActive, setAddActive] = useState(false);
  const { isPending, data, error } = useQuery({
    queryKey: ["todos"],
    queryFn: fetchData,
  });
  if (isPending) {
    return <p>Loading...</p>;
  }
  if (error) {
    return <p>Error: {error.message}</p>;
  }
  return (
    <>
      <div className="flex items-center justify-between ml-[175px] mr-[175px] mt-11">
        <h1 className="text-2xl">Ваш персонал</h1>
        <section>
          <button
            className="bg-[#0c6565] text-white px-4 py-2 rounded-full hover:bg-[#094949] transition"
            onClick={() => setAddActive(true)}
          >
            Добавить сотрудника
          </button>
          <Addworker isOpen={addActive} onClose={() => setAddActive(false)} />
        </section>
      </div>

      <div className="">
        <div className="relative mt-[30px] mx-[150px] border"></div>
        <div className="mt-[30px] mx-[150px] h-[200px] flex  gap-y-5 px-5 gap-x-6">
          <div className="size-[135px] bg-[#D9D9D9]"></div>
          <div className="">
            <p>ФИО: Никита Рекунов Максимович</p>
            <p>Почта: example@mail.com</p>
            <p>Телефон: 8 800 555 35 35</p>
          </div>
          <div className="">
            <p>Дата рождения: 00.00.0000</p>
            <p>Пол: Мужской</p>
            <button className="bg-[#0C6565] text-white p-2 rounded-lg">
              Добавить в сравнение
            </button>
          </div>
        </div>
      </div>
    </>
  );
};

export default WorkersPage;
