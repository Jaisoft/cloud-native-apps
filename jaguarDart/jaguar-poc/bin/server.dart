import 'package:jaguar/jaguar.dart';

main(List<String> args) async {

  final server = Jaguar(port: 8081);
  
  
  server.get('/hello', (_) => 'Hello');
  
  server.log.onRecord.listen(print);
  
  // Launch server
  await server.serve(logRequests: true);
}
