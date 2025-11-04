penghasilan = int(input("Masukan penghasilan anda: "))

if penghasilan > 500000000:
    pajak = penghasilan * 0.2
    print (pajak)
elif penghasilan > 250000000 and penghasilan <= 500000000:
    pajak = penghasilan * 0.15
    print ('besar pajak anda: ', pajak)
elif penghasilan > 50000000 and penghasilan <= 250000000:
    pajak = penghasilan * 0.1
    print ('besar pajak anda: ', pajak)
elif penghasilan == 50000000:
    pajak = penghasilan * 0.05
    print ('besar pajak anda: ', pajak)
elif penghasilan == -1:
    print ('Program berhenti')
else:
    print ('Penghasilan anda tidak valid')