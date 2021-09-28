import React from "react";
import './index.css';
import MainPage from "./components/MainPage/MainPage";
import styled from "styled-components";

const AppContainer = styled.div`
   font-family: Segoe UI;
`
function App() {
    return (
        <AppContainer>
            <MainPage />
        </AppContainer>
    );
}

export default App;
