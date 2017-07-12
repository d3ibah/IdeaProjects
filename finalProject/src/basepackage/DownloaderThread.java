package basepackage;

/*
этот поток скачивает JSON, затем ждет пока его распарсит другой поток.
Затем скачивает XML и снова ждет пока его распарсит другой поток.
 */
public class DownloaderThread extends Thread{
    private ParserThread parserThread;

    public void setParserThread(ParserThread parserThread) {
        this.parserThread = parserThread;
    }

    @Override
    public void run() {
        // делаем вид будто скачиваем))
        // скачиваем ДСОН
        System.out.println("DownloaderThread - скачиваем джисон");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        // пробуждаем поток парсера, затем сами засыпаем
        System.out.println("DownloaderThread - пробуждаем поток парсера");
        synchronized (parserThread) {
            parserThread.notifyAll();
        }
        synchronized (this){
            System.out.println("DownloaderThread - засыпает");
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }

        // делаем вид будто скачиваем))
        // скачиваем XML
        System.out.println("DownloaderThread - скачиваем джисон");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        // пробуждаем поток парсера, затем сами засыпаем
        System.out.println("DownloaderThread - пробуждаем поток парсера");
        synchronized (parserThread) {
            parserThread.notifyAll();
        }
        System.out.println("DownloaderThread - завершил поток");

    }
}
