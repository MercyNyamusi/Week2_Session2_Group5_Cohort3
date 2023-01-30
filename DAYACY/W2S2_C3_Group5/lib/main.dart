import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';

//Pages
import './about.dart';
import './rotate.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      // Application name
      title: 'DAYACY STORE',
      // Application theme data, you can set the colors for the application as
      // you want
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      // A widget which will be started on application startup
      home: MyHomePage(title: 'DAYACY'),
    );
  }
}

class MyHomePage extends StatelessWidget {
  final String title;
  const MyHomePage({Key? key, required this.title}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        // The title text which will be shown on the action bar
        title: Text(title),
        actions: <Widget>[
          IconButton(
              icon: Icon(Icons.notifications_none),
              onPressed: () {
                print("Notification Clicked");
              },
              color: Colors.white54),
          PopupMenuButton(
              shape:
                  OutlineInputBorder(borderRadius: BorderRadius.circular(10)),
              itemBuilder: (context) => [
                    PopupMenuItem(child: Text('Profile')),
                    PopupMenuItem(child: Text('Wishlist')),
                    PopupMenuItem(child: Text('Setting')),
                    PopupMenuItem(child: Text('Sign Out')),
                  ])
        ],
        elevation: 6,
        titleSpacing: 12,
      ),
      body: Container(
        padding: EdgeInsets.all(20.0),
        child: Text("DAYACY STORE"),
        color: Colors.blue[400],
        margin: EdgeInsets.fromLTRB(115, 0.0, 0.0, 0.0),
      ),
      drawer: new Drawer(
        child: ListView(
          children: <Widget>[
            new UserAccountsDrawerHeader(
              accountName: new Text('Chloe'),
              accountEmail: new Text('chloecardashian@gmail.com'),
              currentAccountPicture: new CircleAvatar(
                backgroundImage: new NetworkImage('https://i.pravatar.cc/300'),
              ),
            ),
            new ListTile(
              title: new Text('About Page'),
              onTap: () {
                Navigator.of(context).pop();
                Navigator.push(
                    context,
                    new MaterialPageRoute(
                        builder: (BuildContext context) => new AboutPage()));
              },
            ),
            new Divider(
              color: Colors.black,
              height: 5.0,
            ),
            new ListTile(
              title: new Text('Rotated Image'),
              onTap: () {
                Navigator.of(context).pop();
                Navigator.push(
                    context,
                    new MaterialPageRoute(
                        builder: (BuildContext context) => new FunPage()));
              },
            )
          ],
        ),
      ),
      floatingActionButton: FloatingActionButton.extended(
        onPressed: () {
          print("Clicked");
        },
        icon: Icon(Icons.message),
        label: Text('Chat with us!'),
      ),
    );
  }
}
