import threading
import time
import sys

lockThreadConsole = threading.Lock()

def thread_function(name):
    global lockThreadConsole
    tVar = name
    boolVar = True
    floatVar = float(1.23e1)
    complexVar = complex(3.21, 4.56)
    with lockThreadConsole: 
        print("Thread %s: starting, %s" % (name, tVar))
    for i in range(5):
        time.sleep(1)
        with lockThreadConsole: 
            print("Thread %s -> %i" % (name, i))
        if i == 3:
            with lockThreadConsole:
                # tVar = input("Input new name for thread %s: " % name)
                print("Now name is %s" % tVar)
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
    print(sys.argv)
    main()
