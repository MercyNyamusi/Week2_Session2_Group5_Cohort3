import 'package:flutter/material.dart';

class AboutPage extends StatefulWidget {
  const AboutPage({Key? key}) : super(key: key);
  _AboutPageState createState() => _AboutPageState();
}

class _AboutPageState extends State<AboutPage> {
  @override
  Widget build(BuildContext context) {
    return new Scaffold(
        appBar: new AppBar(
          title: new Text('About Page'),
        ),
        body: ListView(children: <Widget>[
          Center(
              child: Container(
                  width: 300,
                  height: 200,
                  color: Colors.black,
                  child: FittedBox(
                      fit: BoxFit.fill,
                      child: Image.network(
                          'http://t1.gstatic.com/licensed-image?q=tbn:ANd9GcTVNBVgDTZrFvUARECMzBrur7L34aGgMgeqrY3JE6rWUauX3cRgAjXim93D7cn2UTQM')))),
          ConstrainedBox(
              constraints: BoxConstraints.expand(width: 100, height: 200),
              child: Text(
                  "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed rutrum quis dui at fringilla. Aenean malesuada congue felis vel dictum. Donec iaculis purus felis, nec semper diam volutpat sed.")),
          SizedBox(
            width: 100,
            height: 50,
          ),
          Center(
              child: Container(
                  width: 300,
                  height: 200,
                  color: Colors.black,
                  child: FittedBox(
                      fit: BoxFit.fill,
                      child: Image.network(
                          'https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/popular-puppy-questions-1639736471.jpg')))),
          ConstrainedBox(
              constraints: BoxConstraints.expand(width: 100, height: 200),
              child: Text(
                  "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed rutrum quis dui at fringilla. Aenean malesuada congue felis vel dictum. Donec iaculis purus felis, nec semper diam volutpat sed.")),
          SizedBox(width: 100, height: 50),
          Center(
              child: Container(
                  width: 300,
                  height: 200,
                  color: Colors.black,
                  child: FittedBox(
                      fit: BoxFit.fill,
                      child: Image.network(
                          'https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/popular-puppy-questions-1639736471.jpg')))),
          ConstrainedBox(
              constraints: BoxConstraints.expand(width: 100, height: 200),
              child: Text(
                  "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed rutrum quis dui at fringilla. Aenean malesuada congue felis vel dictum. Donec iaculis purus felis, nec semper diam volutpat sed.")),
          SizedBox(
            width: 100,
            height: 50,
          )
        ]));
  }
}
