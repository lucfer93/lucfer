import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';

void main() => runApp(MaterialApp(home: ToDo()));

class ToDo extends StatefulWidget {
  @override
  _ToDoState createState() => _ToDoState();
}

class _ToDoState extends State<ToDo> {
  Map<String, bool> products = {
  };


  void addItem(String item) {
    setState(() {
      products[item] = false;
    });
    Navigator.of(context).pop();
  }

  void deleteItem(String key) {
    setState(() {
      products.remove(key);
    });
  }

  void toggleDone(String key) {
    setState(() {
      products.update(key, (bool done) => !done);
    });
  }

  void newEntry() {
    showDialog<AlertDialog>(
        context: context,
        builder: (BuildContext context) {
          return AlertDialog(
            content: TextField(
              onSubmitted: addItem,
              decoration: InputDecoration(
                border: OutlineInputBorder(),
                labelText: 'Neues To-Do',
              ),
            ),
          );
        });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("To-Do",
            style: TextStyle(fontSize: 30)),
        centerTitle: true,
        backgroundColor: Color.fromRGBO(100, 250, 130, 100),
      ),
      body: ListView.builder(
        itemCount: products.length,
        itemBuilder: (context, i) {
          String key = products.keys.elementAt(i);
          return ToDoItem(
              key,
              products[key],
              () => deleteItem(key),
              () => toggleDone(key),
          );
        },
      ),
      floatingActionButton: Container(
        height: 85.0,
        width: 85.0,
        child: FittedBox(
          child: FloatingActionButton(onPressed: newEntry,
          child: Icon(Icons.add_outlined),
          backgroundColor: Color.fromRGBO(100, 250, 130, 600),
          ),
        ),
      ),
    );
  }
}

class ToDoItem extends StatelessWidget {
  final String title;
  final bool done;
  final Function remove;
  final Function toggleDone;
  const ToDoItem(this.title, this.done, this.remove, this.toggleDone);

  @override
  Widget build(BuildContext context) {
    return Container(
      padding: EdgeInsets.symmetric(horizontal: 22),
      child: ListTile(
        contentPadding: EdgeInsets.symmetric(vertical: 8.0),
        leading: Checkbox(
          value: done,
          onChanged: (bool value) => toggleDone(),
          activeColor: Color.fromRGBO(155, 181, 49, 600),
        ),
        title: Text(
          title,
          style: TextStyle(
              fontSize: 22.0,
              fontWeight: FontWeight.w600,
              color: done
              ? Color.fromRGBO(155, 181, 49, 600)
              : Colors.black54,
          decoration: done
          ? TextDecoration.lineThrough
          : TextDecoration.none,),
        ),
        trailing: IconButton(
        icon: Icon(Icons.delete_outline),
    onPressed: () => remove(),
      )
    ),
    );
  }
}
