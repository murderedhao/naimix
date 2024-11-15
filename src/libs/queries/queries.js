import axios from "axios";

const url = "https://6245127ed042f081.mokky.dev/enHoroscope";

async function getHoroscope() {
  try {
    return await axios.get(url);
  } catch (error) {
    console.error("Error fetching:", error.message);
  }
}

export { getHoroscope };
