import Header from "../../components/Header/Header";
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

const Main = () => {
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
      <Header />
      <ul>
        {data.map((obj, index) => (
          <li key={index}>{obj.id}</li>
        ))}
      </ul>
    </>
  );
};

export default Main;
