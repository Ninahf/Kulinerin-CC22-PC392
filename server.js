const express = require("express");
const mysql = require("mysql");
const Pool = require("mysql/lib/Pool");
const app = express();

app.use(express.json());
const port = process.env.PORT || 8080;
app.listen(port, () => {
    console.log(`Test Recipe API show on port ${port}`);
});

app.get("/", async (req, res) => {
    res.json ({status: "Recipe listed"});
});

app.get("/:foods", async (req, res) => {
    const query = "SELECT * FORM foods WHERE name = ?";
    pool.query(query, [req.params.foods], (error, result) => {
        if (!result[0]) {
            res.json({status: "Not found!"});
        }else {
            res.json(result[0]);
        }
    });
});

const pool = mysql.createPool({
    user: process.env.DB_USER,
    password: process.env.DB_PASS,
    database: process.env.DB_NAME,
    socketPath: `/cloudsql/${process.env.INSTANCE_CONNECTION_NAME}`,
});
