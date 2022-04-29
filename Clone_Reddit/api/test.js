import mongoose from 'mongoose';

URL= "mongodb+srv://Musi340:Uotbc2015@cluster0.iebi3.mongodb.net/test";

await mongoose.connect(URL, {useNewUrlParser:true,useUnifiedTopology:true,});
const db = mongoose.connection;
db.once("open", function () {
  console.log("Connected successfully!");
});
db.on('error', console.log);