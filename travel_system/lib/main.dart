import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: '二组的旅游自助系统',
      theme: ThemeData(
        // This is the theme of your application.
        //
        // Try running your application with "flutter run". You'll see the
        // application has a blue toolbar. Then, without quitting the app, try
        // changing the primarySwatch below to Colors.green and then invoke
        // "hot reload" (press "r" in the console where you ran "flutter run",
        // or simply save your changes to "hot reload" in a Flutter IDE).
        // Notice that the counter didn't reset back to zero; the application
        // is not restarted.
        primarySwatch: Colors.blue,
      ),
      home: const HomePage(title: '旅游自助系统'),
    );
  }
}

class HomePage extends StatefulWidget {
  const HomePage({super.key, required this.title});

  // This widget is the home page of your application. It is stateful, meaning
  // that it has a State object (defined below) that contains fields that affect
  // how it looks.

  // This class is the configuration for the state. It holds the values (in this
  // case the title) provided by the parent (in this case the App widget) and
  // used by the build method of the State. Fields in a Widget subclass are
  // always marked "final".

  final String title;

  @override
  State<HomePage> createState() => _HomePageState();
}

class _HomePageState extends State<HomePage>
    with SingleTickerProviderStateMixin {
  @override
  void initState() {
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    return DefaultTabController(
      length: 6,
      child: Scaffold(
        appBar: AppBar(
          title: Text(widget.title),
          centerTitle: true,
          bottom: const TabBar(
            tabs: <Widget>[
              Tab(text: '交通'),
              Tab(text: '美食'),
              Tab(text: '景点'),
              Tab(text: '购物'),
              Tab(text: '住宿'),
              Tab(text: '我的'),
            ],
          ),
        ),
        body: const TabBarView(
          children: <Widget>[
            TrafficPage(),
            DelicacyPage(),
            AttractionPage(),
            BusinessPage(),
            LodgingPage(),
            MinePage(),
          ],
        ),
      ),
    );
  }
}

/// 交通
class TrafficPage extends StatefulWidget {
  const TrafficPage({super.key});

  @override
  State<StatefulWidget> createState() => _TrafficPageState();
}

class _TrafficPageState extends State<TrafficPage> {
  @override
  Widget build(BuildContext context) => const Center(child: Text('交通'));
}

/// 美食
class DelicacyPage extends StatefulWidget {
  const DelicacyPage({super.key});

  @override
  State<StatefulWidget> createState() => _DelicacyPageState();
}

class _DelicacyPageState extends State<DelicacyPage> {
  @override
  Widget build(BuildContext context) => const Center(child: Text('美食'));
}

///景点
class AttractionPage extends StatefulWidget {
  const AttractionPage({super.key});

  @override
  State<StatefulWidget> createState() => _AttractionPageState();
}

class _AttractionPageState extends State<AttractionPage> {
  @override
  Widget build(BuildContext context) => const Center(child: Text('景点'));
}

///购物
class BusinessPage extends StatefulWidget {
  const BusinessPage({super.key});

  @override
  State<StatefulWidget> createState() => _BusinessPageState();
}

class _BusinessPageState extends State<BusinessPage> {
  @override
  Widget build(BuildContext context) => const Center(child: Text('购物'));
}

///住宿
class LodgingPage extends StatefulWidget {
  const LodgingPage({super.key});

  @override
  State<StatefulWidget> createState() => _LodgingPageState();
}

class _LodgingPageState extends State<LodgingPage> {
  @override
  Widget build(BuildContext context) => const Center(child: Text('住宿'));
}

///我的
class MinePage extends StatefulWidget {
  const MinePage({super.key});

  @override
  State<StatefulWidget> createState() => _MinePageState();
}

class _MinePageState extends State<MinePage> {
  @override
  Widget build(BuildContext context) => const Center(child: Text('我的'));
}
