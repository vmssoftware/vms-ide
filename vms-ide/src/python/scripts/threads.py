import threading
import time

lockThreadConsole = threading.Lock()

def thread_function(name):
    global lockThreadConsole
    tVar = "0"
    with lockThreadConsole: 
        print("Thread %s: starting, %s" % (name, tVar))
    for i in range(5):
        time.sleep(1)
        with lockThreadConsole: 
            print("Thread %s -> %i" % (name, i))
        if i == 3:
            with lockThreadConsole: 
                tVar = input("Input some for thread %s: " % name)
    with lockThreadConsole: 
        print("Thread %s: finishing, %s" % (name, tVar))

def main():
    threads = list()
    for index in range(3):
        print("Main    : create and start thread %d." % index)
        x = threading.Thread(target=thread_function, args=(index,))
        threads.append(x)
        x.start()
    
    time.sleep(0.01)

    for index, thread in enumerate(threads):
        # print("Main    : before joining thread %d." % index)
        thread.join()
        # print("Main    : thread %d done." % index)

if __name__ == "__main__":
    main()
