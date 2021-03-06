package com.poc.parser.main;

public interface ParserTestDefinition {
    //Content of main/resources/data/input.txt
    String INPUT = "h92o.y0j5.021l 919.768.581.066 C1/0/0/UB     w-online(pt)      1     1   In1/0/0:12     8204\n" +
            "svhq.k6iq.uqay 564.735.605.121 C1/0/0/UB     w-online(pt)      2     2   In1/0/0:4      8196\n" +
            "bd3l.g5bb.xcw9 018.626.280.92  C1/0/0/UB     w-online(pt)      3     1   In1/0/0:0      8192\n" +
            "85nl.h18u.9ai7 385.184.194.461 C1/0/0/UB     w-online(pt)      4     1   In1/0/0:16     8208\n" +
            "7irw.b2mj.xiy3 904.218.170.136 C1/0/0/UB     w-online(pt)      5     1   In1/0/0:8      8200\n" +
            "zrh6.mwaq.a45i 960.648.303.992 C1/0/0/UB     w-online(pt)      6     1   In1/0/0:12     8204\n" +
            "gyu8.3c5j.18l7 663.336.144.897 C1/0/0/UB     w-online(pt)      7     1   In1/0/0:20     8212\n" +
            "7oo1.7sg9.hwpt 960.441.457.235 C1/0/0/UB     w-online(pt)      11    1   In1/0/0:8      8200\n" +
            "we8x.wa6s.o1tj 770.126.607.930 C1/0/0/UB     w-online(pt)      12    2   In1/0/0:20     8212\n" +
            "f22o.98zu.3zk8 859.379.810.114 C1/0/0/UB     w-online(pt)      22    1   In1/0/0:12     8204\n" +
            "624p.56o0.1hsg 223.059.858.789 C1/0/0/UB     w-online(pt)      24    2   In1/0/0:12     8204\n" +
            "46hb.hfzc.0rpp 530.149.826.34  C1/0/0/UB     w-online(pt)      25    2   In1/0/0:4      8196\n" +
            "kb5u.wa7s.5gif 947.091.954.911 C1/0/0/UB     w-online(pt)      26    1   In1/0/0:4      8196\n" +
            "4eye.uvzf.diqp 882.228.462.587 C1/0/0/UB     w-online(pt)      30    2   In1/0/0:16     8208\n" +
            "dhsd.t17j.syc4 702.416.846.298 C1/0/0/UB     w-online(pt)      43    1   In1/0/0:0      8192\n" +
            "imcd.xhap.fjet 621.993.010.553 C1/0/0/UB     w-online(pt)      44    1   In1/0/0:8      8200\n" +
            "qfl0.pu41.5rv1 785.498.253.247 C1/0/0/UB     w-online(pt)      54    1   In1/0/0:4      8196\n" +
            "wtut.jjsc.zzzd 020.707.034.025 C1/0/0/UB     w-online(pt)      55    1   In1/0/0:12     8204\n" +
            "nyky.2fw4.8e6b 608.928.077.725 C1/0/0/UB     w-online(pt)      67    1   In1/0/0:8      8200\n" +
            "s3fm.16ds.no4c 467.684.253.462 C1/0/0/UB     w-online(pt)      76    2   In1/0/0:0      8192\n" +
            "tbmg.xhiv.q88y 007.069.075.276 C1/0/0/UB     w-online(pt)      99    1   In1/0/0:12     8204\n" +
            "bl7y.u3ij.0go2 540.638.201.797 C1/0/0/UB     w-online(pt)      111   1   In1/0/0:8      8200\n" +
            "bbev.ngoc.pb8p 487.089.413.834 C1/0/0/UB     w-online(pt)      129   1   In1/0/0:8      8200\n" +
            "whp0.iogv.3sch 140.139.255.216 C1/0/0/UB     w-online(pt)      130   1   In1/0/0:12     8204\n" +
            "i3ro.iug1.hog4 738.678.879.258 C1/0/0/UB     w-online(pt)      131   2   In1/0/0:4      8196\n" +
            "nxhs.hbz6.wegh 118.629.145.964 C1/0/0/UB     w-online(pt)      132   1   In1/0/0:4      8196\n" +
            "1ggq.rap7.maf9 298.169.376.824 C1/0/0/UB     w-online(pt)      133   2   In1/0/0:0      8192\n" +
            "1jbh.v7ev.rszh 382.123.856.623 C1/0/0/UB     w-online(pt)      137   2   In1/0/0:8      8200";

    String INPUT_WITH_HEADERS = "Load for five secs: 93%/13%; one minute: 44%; five minutes: 46%\n" +
            "Time source is NTP, 15:41:49.945 EDT Wed Jun 23 2021\n" +
            "MAC Address    IP Address      Host          MAC               Prim  Num Primary        DS\n" +
            "                               Interface     State             Sid   CPE Downstream     RfId\n" +
            "h92o.y0j5.021l 919.768.581.066 C1/0/0/UB     w-online(pt)      1     1   In1/0/0:12     8204\n" +
            "svhq.k6iq.uqay 564.735.605.121 C1/0/0/UB     w-online(pt)      2     2   In1/0/0:4      8196\n" +
            "bd3l.g5bb.xcw9 018.626.280.92  C1/0/0/UB     w-online(pt)      3     1   In1/0/0:0      8192\n" +
            "85nl.h18u.9ai7 385.184.194.461 C1/0/0/UB     w-online(pt)      4     1   In1/0/0:16     8208\n" +
            "7irw.b2mj.xiy3 904.218.170.136 C1/0/0/UB     w-online(pt)      5     1   In1/0/0:8      8200\n" +
            "zrh6.mwaq.a45i 960.648.303.992 C1/0/0/UB     w-online(pt)      6     1   In1/0/0:12     8204\n" +
            "gyu8.3c5j.18l7 663.336.144.897 C1/0/0/UB     w-online(pt)      7     1   In1/0/0:20     8212\n" +
            "7oo1.7sg9.hwpt 960.441.457.235 C1/0/0/UB     w-online(pt)      11    1   In1/0/0:8      8200\n" +
            "we8x.wa6s.o1tj 770.126.607.930 C1/0/0/UB     w-online(pt)      12    2   In1/0/0:20     8212\n" +
            "f22o.98zu.3zk8 859.379.810.114 C1/0/0/UB     w-online(pt)      22    1   In1/0/0:12     8204\n" +
            "624p.56o0.1hsg 223.059.858.789 C1/0/0/UB     w-online(pt)      24    2   In1/0/0:12     8204\n" +
            "46hb.hfzc.0rpp 530.149.826.34  C1/0/0/UB     w-online(pt)      25    2   In1/0/0:4      8196\n" +
            "kb5u.wa7s.5gif 947.091.954.911 C1/0/0/UB     w-online(pt)      26    1   In1/0/0:4      8196\n" +
            "4eye.uvzf.diqp 882.228.462.587 C1/0/0/UB     w-online(pt)      30    2   In1/0/0:16     8208\n" +
            "dhsd.t17j.syc4 702.416.846.298 C1/0/0/UB     w-online(pt)      43    1   In1/0/0:0      8192\n" +
            "imcd.xhap.fjet 621.993.010.553 C1/0/0/UB     w-online(pt)      44    1   In1/0/0:8      8200\n" +
            "qfl0.pu41.5rv1 785.498.253.247 C1/0/0/UB     w-online(pt)      54    1   In1/0/0:4      8196\n" +
            "wtut.jjsc.zzzd 020.707.034.025 C1/0/0/UB     w-online(pt)      55    1   In1/0/0:12     8204\n" +
            "nyky.2fw4.8e6b 608.928.077.725 C1/0/0/UB     w-online(pt)      67    1   In1/0/0:8      8200\n" +
            "s3fm.16ds.no4c 467.684.253.462 C1/0/0/UB     w-online(pt)      76    2   In1/0/0:0      8192\n" +
            "tbmg.xhiv.q88y 007.069.075.276 C1/0/0/UB     w-online(pt)      99    1   In1/0/0:12     8204\n" +
            "bl7y.u3ij.0go2 540.638.201.797 C1/0/0/UB     w-online(pt)      111   1   In1/0/0:8      8200\n" +
            "bbev.ngoc.pb8p 487.089.413.834 C1/0/0/UB     w-online(pt)      129   1   In1/0/0:8      8200\n" +
            "whp0.iogv.3sch 140.139.255.216 C1/0/0/UB     w-online(pt)      130   1   In1/0/0:12     8204\n" +
            "i3ro.iug1.hog4 738.678.879.258 C1/0/0/UB     w-online(pt)      131   2   In1/0/0:4      8196\n" +
            "nxhs.hbz6.wegh 118.629.145.964 C1/0/0/UB     w-online(pt)      132   1   In1/0/0:4      8196\n" +
            "1ggq.rap7.maf9 298.169.376.824 C1/0/0/UB     w-online(pt)      133   2   In1/0/0:0      8192\n" +
            "1jbh.v7ev.rszh 382.123.856.623 C1/0/0/UB     w-online(pt)      137   2   In1/0/0:8      8200";
}
