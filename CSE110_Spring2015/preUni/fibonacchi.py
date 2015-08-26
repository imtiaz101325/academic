#Algorithm 2.6:Generating Fibonacchi numbers
#Reference:How to solve it by computer; R. G. Dromey
#Author:Sk. Imtiaz Ahmed
#8 February 2015

def fibonacchi():

    fib = input("Enter n where upto the nth Fibonacchi number will be printed:")
    formerSigFib = 0
    latterSigFib = 1
    i            = 2

    while i<fib:

        print "%d, %d, " % (formerSigFib, latterSigFib),

        formerSigFib = formerSigFib+latterSigFib
        latterSigFib = formerSigFib+latterSigFib

        i=i+2

    if fib%2 == 0:
        print "%d, %d" % (formerSigFib,latterSigFib)
    else:
        print "%d" % formerSigFib

if __name__ == '__main__':

    fibonacchi()



