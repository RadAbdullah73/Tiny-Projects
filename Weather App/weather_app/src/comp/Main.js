import React  , { useState, useEffect } from 'react'
import axios  from 'axios'


const Main = (props) => {
    const [weather,setWeather]=useState(null);
    const Api_Key=''
    const Api_url = `https://api.openweathermap.org/data/2.5/weather?q=${props.city}&units=metric&appid=${Api_Key}`;
    
    useEffect(() => {
        axios
          .get(Api_url)
          .then((response) => {
            setWeather(response.data);
          })
          .catch((error) => {
            console.log(error);
          });
      }, [Api_url]);

      
      if (!weather) {
        return <div>Loading...</div>;
      }
    
      const { main, description } = weather.weather[0];
      const { temp, feels_like } = weather.main;
    
      return (
        <div>
          <h2>Current Weather in {props.city}</h2>
          <p>{main} ({description})</p>
          <p>Temperature: {temp} &#8451; (Feels like {feels_like} &#8451;)</p>
        </div>
      );
    };
    
    export default Main;