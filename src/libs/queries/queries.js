import axios from "axios";

// Создаем экземпляр Axios с настройками по умолчанию
const instance = axios.create({
  baseURL: "https://jsonplaceholder.typicode.com/users",
});

// Добавляем токен в заголовки всех запросов
instance.interceptors.request.use(
  (config) => {
    const token = localStorage.getItem("token"); // Получаем токен из локального хранилища
    if (token) {
      config.headers.Authorization = `Bearer ${token}`;
    }
    return config;
  },
  (error) => Promise.reject(error)
);

// Пример использования для получения данных
const getProtectedData = async () => {
  try {
    const response = await instance.get("/");
    return response.data;
  } catch (error) {
    console.error(error.response.data.message || error.message);
  }
};

export default getProtectedData;
