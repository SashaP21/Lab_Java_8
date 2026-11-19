import dip.EmailSender;
import dip.NotificationService;
import dip.SmsSender;
import isp.MultiFunctionDevice;
import isp.OldPrinter;
import isp.Printer;
import lsp.Bird;
import lsp.Flyable;
import lsp.Penguin;
import lsp.Sparrow;
import ocp.DiscountCalculator;
import ocp.RegularDiscount;
import ocp.SuperVipDiscount;
import ocp.VipDiscount;
import srp.ReportCalculator;
import srp.ReportFormatter;
import srp.ReportSaver;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // ---------- S ----------
        ReportCalculator calculator = new ReportCalculator(List.of(5, 10, 15, 20));
        ReportFormatter formatter = new ReportFormatter();
        ReportSaver saver = new ReportSaver();

        int sum = calculator.calculateSum();
        double avg = calculator.calculateAverage();
        String report = formatter.format(sum, avg);
        System.out.print(report);
        saver.saveToFile(report);

        // ---------- O ----------
        DiscountCalculator regular = new RegularDiscount();
        DiscountCalculator vip = new VipDiscount();
        DiscountCalculator superVip = new SuperVipDiscount();

        System.out.println("Regular: " + regular.calculateDiscount(1000));
        System.out.println("VIP: " + vip.calculateDiscount(1000));
        System.out.println("Super VIP: " + superVip.calculateDiscount(1000));

        // ---------- L ----------
        displayBird(new Sparrow());
        displayBird(new Penguin());

        Flyable flyer = new Sparrow();
        flyer.fly();

        // ---------- I ----------
        Printer oldPrinter = new OldPrinter();
        oldPrinter.print("Отчёт за неделю");

        MultiFunctionDevice device = new MultiFunctionDevice();
        device.print("Договор");
        device.scan("Паспорт");
        device.fax("Заявление");

        // ---------- D ----------
        NotificationService emailService = new NotificationService(new EmailSender());
        emailService.send("Ваш заказ готов к выдаче!");

        NotificationService smsService = new NotificationService(new SmsSender());
        smsService.send("Ваш заказ готов к выдаче!");
    }

    public static void displayBird(Bird bird) {
        bird.eat();
    }
}
