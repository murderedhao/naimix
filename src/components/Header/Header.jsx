import { useState } from "react";
import Login from "../Modal/Login";
import Modal from "../Modal/Modal";

const Header = () => {
  const [modalActive, setModalActive] = useState(false);
  const [loginActive, setLoginActive] = useState(false);
  return (
    <>
      <header className="bg-white shadow-md">
        <div className="container mx-auto px-4 py-4 flex items-center justify-between">
          {/* Логотип */}
          <a href="/" className="flex items-center space-x-2">
            <img
              src="https://static.tildacdn.com/tild3737-3931-4565-b563-643635636330/naimix-black2.svg"
              alt="Naimix"
              className="h-10"
            />
          </a>

          {/* Навигация */}
          <nav className="hidden lg:flex space-x-6">
            <a
              href="/workers"
              className="text-[#0c6565] hover:text-black transition"
            >
              Работники компании
            </a>
          </nav>
          <nav className="hidden lg:flex space-x-6">
            <a
              href="/compatibility"
              className="text-[#0c6565] hover:text-black transition"
            >
              Сравнение совместимости
            </a>
          </nav>

          {/* Блок с кнопками */}
          <div className="flex items-center space-x-4">
            <section>
              <button
                className="text-black p-4 text-sm font-normal uppercase border border-solid border-[#0c6565] rounded-full leading-relaxed transition-colors ease-in-out duration-200 hover:bg-black hover:text-white hover:border-black"
                onClick={() => setLoginActive(true)}
              >
                Войти
              </button>
              <Login
                onOpen={loginActive}
                onClose={() => setLoginActive(false)}
              />
            </section>
            <section>
              <button
                className="text-black p-4 text-sm font-normal uppercase border border-solid border-[#f15330] rounded-full leading-relaxed transition-colors ease-in-out duration-200 hover:bg-black hover:text-white hover:border-black"
                onClick={() => setModalActive(true)}
              >
                Регистрация
              </button>
              <Modal
                isOpen={modalActive}
                isClose={() => setModalActive(false)}
              />
            </section>
          </div>
        </div>
      </header>
    </>
  );
};

export default Header;
