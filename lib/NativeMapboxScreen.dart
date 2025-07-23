import 'package:flutter/material.dart';
import 'package:flutter/services.dart';

class NativeMapboxScreen extends StatelessWidget {
  final double startLat;
  final double startLng;
  final double endLat;
  final double endLng;

  const NativeMapboxScreen({
    super.key,
    required this.startLat,
    required this.startLng,
    required this.endLat,
    required this.endLng,
  });

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: AndroidView(
        viewType: 'my-navigation-view',
        layoutDirection: TextDirection.ltr,
        creationParamsCodec: const StandardMessageCodec(),
        creationParams: {
          'start': {'lat': startLat, 'lng': startLng},
          'end': {'lat': endLat, 'lng': endLng},
        },
      ),
    );
  }
}