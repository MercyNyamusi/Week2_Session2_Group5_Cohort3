import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';

class FunPage extends StatefulWidget {
  const FunPage({Key? key}) : super(key: key);
  _FunPageState createState() => _FunPageState();
}

class _FunPageState extends State<FunPage> {
  @override
  Widget build(BuildContext context) {
    return new Scaffold(
        appBar: new AppBar(
          title: new Text('ROTATED IMAGE'),
          centerTitle: true,
        ),
        body: RotatedBox(
          quarterTurns: 3,
          child: Container(
            height: double.infinity,
            width: double.infinity,
            child: FittedBox(
                fit: BoxFit.cover,
                child: Image.network(
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS-iin3UFrMPOyAknSZVlEXbLOkU7Q6LkAx-R6_WT5nbg&s")),
          ),
        ));
  }
}
