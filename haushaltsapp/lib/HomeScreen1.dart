import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    final title = 'HomeScreen';

    return MaterialApp(
      title: title,
      home: Scaffold(
        appBar: AppBar(
          title: Text(title),
        ),
        body: Column(
          children: [
            Container(
              padding: EdgeInsets.all(80),
              color: Colors.green,
              child: Text("Hallo Gesa, du hast heute X ToDos", style:
              TextStyle(
              fontSize: 25.0,
                fontStyle: FontStyle.italic,
              ),
              ),
            ),
            Container(
              margin: EdgeInsets.fromLTRB(0, 10, 0, 0),
              child: GridView.count(scrollDirection: Axis.vertical,
                crossAxisCount: 2,
                shrinkWrap: true,
                children: [
                  Card(
                    color: Colors.teal,
                    child:Container(
                      child: Center(
                        child: Text("To-Do's", textAlign: TextAlign.center,style:
                          TextStyle( fontSize: 35),
                        )
                      ),
                  ),
                  ),
                  Card(
                    color: Colors.cyan,
                  ),
                  Card(
                    color: Colors.amber,
                  ),
                  Card(
                    color: Colors.red,
                  ),
                ],
              ),
            ),
          ],
        ),
     ),
   );


  }
}