package basepackage;

/*
 этот поток ждет пока скачается ДСОН, затем парсит и ждут пока скачается ХМЛ и снова парсит
 */

public class ParserThread extends Thread {
    private DownloaderThread downloaderThread;

    public void setDownloaderThread(DownloaderThread downloaderThread) {
        this.downloaderThread = downloaderThread;
    }

    @Override
    public void run() {
        // ждем вызова НОТИФАЙ от ДовлоадТреад
        synchronized (this) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }

        // делаем вид будто парсим))
        // парсим ДСОН
        System.out.println("ParserThread - парсим джисон");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        // пробуждаем поток качки, затем сами засыпаем
        System.out.println("ParserThread - пробуждаем поток довнлоадера");
        synchronized (downloaderThread) {
            downloaderThread.notifyAll();
        }

        synchronized (this){
            System.out.println("ParserThread - засыпает");
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        // делаем вид будто парсим))
        // парсим XML
        System.out.println("ParserThread - парсим джисон");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        System.out.println("ParserThread - завершил поток");

    }
}
