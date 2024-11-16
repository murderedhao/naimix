<<<<<<< HEAD
import Header from "../../components/Header/Header";
import { useState } from "react";
import axios from "axios";
const Main = () => {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [errorMessage, setErrorMessage] = useState(null);

  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      const response = await axios.post(
        "https://jsonplaceholder.typicode.com/users",
        {
          email,
          password,
        }
      );

      if (response.data.token) {
        localStorage.setItem("token", response.data.token); // Сохраняем токен в локальном хранилище
        window.location.href = "/workers"; // Переходим на защищенный маршрут
      }
    } catch (error) {
      console.error(error.response.data.message || error.message);
      setErrorMessage("Неверный логин или пароль");
    }
  };

  return (
    <>
      <Header />
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          value={email}
          onChange={(e) => setEmail(e.target.value)}
          placeholder="Email"
        />
        <input
          type="password"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
          placeholder="Пароль"
        />
        <button type="submit">Войти</button>
        {errorMessage && <p style={{ color: "red" }}>{errorMessage}</p>}
      </form>
      ;
    </>
  );
};

export default Main;
=======
import Header from '../../components/Header/Header'
import Main from '../../components/Main/Main'
const Mainslash = () => {
	return (
		<>
			<Header />
			<Main />
		</>
	)
}

export default Mainslash
>>>>>>> 27f55c197cd8f8889af21d97b61751db61338505
