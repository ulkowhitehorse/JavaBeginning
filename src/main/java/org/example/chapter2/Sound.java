package org.example.chapter2;

public class Sound {
// Расчет расстояния в футах до вспышки молнии. Допустим, промежуток времени до услышанного грома 7,2 секунды
// Звук распространяется в воздухе со скоростью 1100 фут

    final double soundSpeedFt = 1100;
    double timeToFlash;
    double distanceToFlash;

    public void distance_to_flash (double timeToFlash) {
        this.timeToFlash = timeToFlash;
        distanceToFlash = soundSpeedFt * timeToFlash;
        distanceToFlash = FtToMetr.metrInFt(distanceToFlash);
        System.out.println("При времени до звука грома после вспышке молнии " + timeToFlash + " секунд расстояние до молнии будет равным " + distanceToFlash + " метров.");
    }
}
