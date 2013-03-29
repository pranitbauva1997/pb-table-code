
package graphics;
import lib.*;
public class Main extends javax.swing.JFrame {
    private static final long serialVersionUID = 1L;
    static private Log logging = new Log();
    public Main() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
	logging.logIt("Starting the application.");
        jLabel1 = new javax.swing.JLabel();
        H = new javax.swing.JButton();
        Li = new javax.swing.JButton();
        Na = new javax.swing.JButton();
        K = new javax.swing.JButton();
        Rb = new javax.swing.JButton();
        Cs = new javax.swing.JButton();
        Fr = new javax.swing.JButton();
        Be = new javax.swing.JButton();
        Mg = new javax.swing.JButton();
        Ca = new javax.swing.JButton();
        Sr = new javax.swing.JButton();
        Ba = new javax.swing.JButton();
        Ra = new javax.swing.JButton();
        Sc = new javax.swing.JButton();
        Y = new javax.swing.JButton();
        La = new javax.swing.JButton();
        Ac = new javax.swing.JButton();
        Ti = new javax.swing.JButton();
        Zr = new javax.swing.JButton();
        Hf = new javax.swing.JButton();
        Rf = new javax.swing.JButton();
        V = new javax.swing.JButton();
        Nb = new javax.swing.JButton();
        Ta = new javax.swing.JButton();
        Db = new javax.swing.JButton();
        Cr = new javax.swing.JButton();
        Mo = new javax.swing.JButton();
        W = new javax.swing.JButton();
        Sg = new javax.swing.JButton();
        Mn = new javax.swing.JButton();
        Tc = new javax.swing.JButton();
        Re = new javax.swing.JButton();
        Bh = new javax.swing.JButton();
        Fe = new javax.swing.JButton();
        Ru = new javax.swing.JButton();
        Os = new javax.swing.JButton();
        Hs = new javax.swing.JButton();
        Co = new javax.swing.JButton();
        Rh = new javax.swing.JButton();
        Ir = new javax.swing.JButton();
        Mt = new javax.swing.JButton();
        Ni = new javax.swing.JButton();
        Pd = new javax.swing.JButton();
        Pt = new javax.swing.JButton();
        Ds = new javax.swing.JButton();
        Cu = new javax.swing.JButton();
        Ag = new javax.swing.JButton();
        Au = new javax.swing.JButton();
        Rg = new javax.swing.JButton();
        Zn = new javax.swing.JButton();
        Cd = new javax.swing.JButton();
        Hg = new javax.swing.JButton();
        Cn = new javax.swing.JButton();
        Ga = new javax.swing.JButton();
        In = new javax.swing.JButton();
        Tl = new javax.swing.JButton();
        Uut = new javax.swing.JButton();
        Al = new javax.swing.JButton();
        B = new javax.swing.JButton();
        C = new javax.swing.JButton();
        Si = new javax.swing.JButton();
        Ge = new javax.swing.JButton();
        Sn = new javax.swing.JButton();
        Pb = new javax.swing.JButton();
        Fl = new javax.swing.JButton();
        N = new javax.swing.JButton();
        P = new javax.swing.JButton();
        As = new javax.swing.JButton();
        Sb = new javax.swing.JButton();
        Bi = new javax.swing.JButton();
        Uup = new javax.swing.JButton();
        O = new javax.swing.JButton();
        S = new javax.swing.JButton();
        Se = new javax.swing.JButton();
        Te = new javax.swing.JButton();
        Po = new javax.swing.JButton();
        Hv = new javax.swing.JButton();
        F = new javax.swing.JButton();
        Cl = new javax.swing.JButton();
        Br = new javax.swing.JButton();
        I = new javax.swing.JButton();
        At = new javax.swing.JButton();
        Uus = new javax.swing.JButton();
        Ne = new javax.swing.JButton();
        He = new javax.swing.JButton();
        Ar = new javax.swing.JButton();
        Kr = new javax.swing.JButton();
        Xe = new javax.swing.JButton();
        Rn = new javax.swing.JButton();
        Uuo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Ce = new javax.swing.JButton();
        Th = new javax.swing.JButton();
        Pr = new javax.swing.JButton();
        Pa = new javax.swing.JButton();
        Nd = new javax.swing.JButton();
        U = new javax.swing.JButton();
        Pm = new javax.swing.JButton();
        Np = new javax.swing.JButton();
        Sm = new javax.swing.JButton();
        Pu = new javax.swing.JButton();
        Eu = new javax.swing.JButton();
        Am = new javax.swing.JButton();
        Gd = new javax.swing.JButton();
        Cm = new javax.swing.JButton();
        Tb = new javax.swing.JButton();
        Bk = new javax.swing.JButton();
        Dy = new javax.swing.JButton();
        Cf = new javax.swing.JButton();
        Ho = new javax.swing.JButton();
        Es = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        Er = new javax.swing.JButton();
        Fm = new javax.swing.JButton();
        Tm = new javax.swing.JButton();
        Md = new javax.swing.JButton();
        Yb = new javax.swing.JButton();
        No = new javax.swing.JButton();
        Lu = new javax.swing.JButton();
        Lr = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        log = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        help = new javax.swing.JMenu();
        contents = new javax.swing.JMenuItem();
        about = new javax.swing.JMenuItem();
	logging.logIt("Initialised all the components of the graphics.");
	logging.logIt("Now adding the ActionListeners to all the graphics components.");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Welcome to Periodic Table");

        H.setText("H");
        H.setToolTipText("Hydrogen");
        H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HActionPerformed(evt);
            }
        });

        Li.setText("Li");
        Li.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LiActionPerformed(evt);
            }
        });

        Na.setText("Na");
        Na.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NaActionPerformed(evt);
            }
        });

        K.setText("K");
        K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KActionPerformed(evt);
            }
        });

        Rb.setText("Rb");
        Rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbActionPerformed(evt);
            }
        });

        Cs.setText("Cs");
        Cs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CsActionPerformed(evt);
            }
        });

        Fr.setText("Fr");
        Fr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrActionPerformed(evt);
            }
        });

        Be.setText("Be");
        Be.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeActionPerformed(evt);
            }
        });

        Mg.setText("Mg");
        Mg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MgActionPerformed(evt);
            }
        });

        Ca.setText("Ca");
        Ca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaActionPerformed(evt);
            }
        });

        Sr.setText("Sr");
        Sr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SrActionPerformed(evt);
            }
        });

        Ba.setText("Ba");
        Ba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaActionPerformed(evt);
            }
        });

        Ra.setText("Ra");
        Ra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RaActionPerformed(evt);
            }
        });

        Sc.setText("Sc");
        Sc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScActionPerformed(evt);
            }
        });

        Y.setText("Y");
        Y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YActionPerformed(evt);
            }
        });

        La.setText("La*");
        La.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaActionPerformed(evt);
            }
        });

        Ac.setText("Ac**");
        Ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcActionPerformed(evt);
            }
        });

        Ti.setText("Ti");
        Ti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiActionPerformed(evt);
            }
        });

        Zr.setText("Zr");
        Zr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZrActionPerformed(evt);
            }
        });

        Hf.setText("Hf");
        Hf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HfActionPerformed(evt);
            }
        });

        Rf.setText("Rf");
        Rf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RfActionPerformed(evt);
            }
        });

        V.setText("V");
        V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VActionPerformed(evt);
            }
        });

        Nb.setText("Nb");
        Nb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NbActionPerformed(evt);
            }
        });

        Ta.setText("Ta");
        Ta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaActionPerformed(evt);
            }
        });

        Db.setText("Db");
        Db.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DbActionPerformed(evt);
            }
        });

        Cr.setText("Cr");
        Cr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrActionPerformed(evt);
            }
        });

        Mo.setText("Mo");
        Mo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoActionPerformed(evt);
            }
        });

        W.setText("W");
        W.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WActionPerformed(evt);
            }
        });

        Sg.setText("Sg");
        Sg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SgActionPerformed(evt);
            }
        });

        Mn.setText("Mn");
        Mn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnActionPerformed(evt);
            }
        });

        Tc.setText("Tc");
        Tc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TcActionPerformed(evt);
            }
        });

        Re.setText("Re");
        Re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReActionPerformed(evt);
            }
        });

        Bh.setText("Bh");
        Bh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BhActionPerformed(evt);
            }
        });

        Fe.setText("Fe");
        Fe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeActionPerformed(evt);
            }
        });

        Ru.setText("Ru");
        Ru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RuActionPerformed(evt);
            }
        });

        Os.setText("Os");
        Os.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OsActionPerformed(evt);
            }
        });

        Hs.setText("Hs");
        Hs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HsActionPerformed(evt);
            }
        });

        Co.setText("Co");
        Co.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoActionPerformed(evt);
            }
        });

        Rh.setText("Rh");
        Rh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RhActionPerformed(evt);
            }
        });

        Ir.setText("Ir");
        Ir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IrActionPerformed(evt);
            }
        });

        Mt.setText("Mt");
        Mt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MtActionPerformed(evt);
            }
        });

        Ni.setText("Ni");
        Ni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NiActionPerformed(evt);
            }
        });

        Pd.setText("Pd");
        Pd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PdActionPerformed(evt);
            }
        });

        Pt.setText("Pt");
        Pt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PtActionPerformed(evt);
            }
        });

        Ds.setText("Ds");
        Ds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DsActionPerformed(evt);
            }
        });

        Cu.setText("Cu");
        Cu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuActionPerformed(evt);
            }
        });

        Ag.setText("Ag");
        Ag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgActionPerformed(evt);
            }
        });

        Au.setText("Au");
        Au.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuActionPerformed(evt);
            }
        });

        Rg.setText("Rg");
        Rg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RgActionPerformed(evt);
            }
        });

        Zn.setText("Zn");
        Zn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZnActionPerformed(evt);
            }
        });

        Cd.setText("Cd");
        Cd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CdActionPerformed(evt);
            }
        });

        Hg.setText("Hg");
        Hg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HgActionPerformed(evt);
            }
        });

        Cn.setText("Cn");
        Cn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CnActionPerformed(evt);
            }
        });

        Ga.setText("Ga");
        Ga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GaActionPerformed(evt);
            }
        });

        In.setText("In");
        In.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InActionPerformed(evt);
            }
        });

        Tl.setText("Tl");
        Tl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TlActionPerformed(evt);
            }
        });

        Uut.setText("Uut");
        Uut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UutActionPerformed(evt);
            }
        });

        Al.setText("Al");
        Al.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlActionPerformed(evt);
            }
        });

        B.setText("B");
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });

        C.setText("C");
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        Si.setText("Si");
        Si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiActionPerformed(evt);
            }
        });

        Ge.setText("Ge");
        Ge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeActionPerformed(evt);
            }
        });

        Sn.setText("Sn");
        Sn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SnActionPerformed(evt);
            }
        });

        Pb.setText("Pb");
        Pb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PbActionPerformed(evt);
            }
        });

        Fl.setText("Fl");
        Fl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlActionPerformed(evt);
            }
        });

        N.setText("N");
        N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NActionPerformed(evt);
            }
        });

        P.setText("P");
        P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PActionPerformed(evt);
            }
        });

        As.setText("As");
        As.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsActionPerformed(evt);
            }
        });

        Sb.setText("Sb");
        Sb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SbActionPerformed(evt);
            }
        });

        Bi.setText("Bi");
        Bi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BiActionPerformed(evt);
            }
        });

        Uup.setText("Uup");
        Uup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UupActionPerformed(evt);
            }
        });

        O.setText("O");
        O.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OActionPerformed(evt);
            }
        });

        S.setText("S");
        S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SActionPerformed(evt);
            }
        });

        Se.setText("Se");
        Se.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeActionPerformed(evt);
            }
        });

        Te.setText("Te");
        Te.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeActionPerformed(evt);
            }
        });

        Po.setText("Po");
        Po.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PoActionPerformed(evt);
            }
        });

        Hv.setText("Hv");
        Hv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HvActionPerformed(evt);
            }
        });

        F.setText("F");
        F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FActionPerformed(evt);
            }
        });

        Cl.setText("Cl");
        Cl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClActionPerformed(evt);
            }
        });

        Br.setText("Br");
        Br.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrActionPerformed(evt);
            }
        });

        I.setText("I");
        I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IActionPerformed(evt);
            }
        });

        At.setText("At");
        At.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtActionPerformed(evt);
            }
        });

        Uus.setText("Uus");
        Uus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UusActionPerformed(evt);
            }
        });

        Ne.setText("Ne");
        Ne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NeActionPerformed(evt);
            }
        });

        He.setText("He");
        He.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeActionPerformed(evt);
            }
        });

        Ar.setText("Ar");
        Ar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArActionPerformed(evt);
            }
        });

        Kr.setText("Kr");
        Kr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KrActionPerformed(evt);
            }
        });

        Xe.setText("Xe");
        Xe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XeActionPerformed(evt);
            }
        });

        Rn.setText("Rn");
        Rn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RnActionPerformed(evt);
            }
        });

        Uuo.setText("Uuo");
        Uuo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UuoActionPerformed(evt);
            }
        });

        jLabel2.setText("Lanthanide Series*");

        jLabel3.setText("Actinide Series**");

        Ce.setText("Ce");
        Ce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CeActionPerformed(evt);
            }
        });

        Th.setText("Th");
        Th.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThActionPerformed(evt);
            }
        });

        Pr.setText("Pr");
        Pr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrActionPerformed(evt);
            }
        });

        Pa.setText("Pa");
        Pa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaActionPerformed(evt);
            }
        });

        Nd.setText("Nd");
        Nd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NdActionPerformed(evt);
            }
        });

        U.setText("U");
        U.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UActionPerformed(evt);
            }
        });

        Pm.setText("Pm");
        Pm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PmActionPerformed(evt);
            }
        });

        Np.setText("Np");
        Np.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NpActionPerformed(evt);
            }
        });

        Sm.setText("Sm");
        Sm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SmActionPerformed(evt);
            }
        });

        Pu.setText("Pu");
        Pu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuActionPerformed(evt);
            }
        });

        Eu.setText("Eu");
        Eu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EuActionPerformed(evt);
            }
        });

        Am.setText("Am");
        Am.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmActionPerformed(evt);
            }
        });

        Gd.setText("Gd");
        Gd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GdActionPerformed(evt);
            }
        });

        Cm.setText("Cm");
        Cm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmActionPerformed(evt);
            }
        });

        Tb.setText("Tb");
        Tb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TbActionPerformed(evt);
            }
        });

        Bk.setText("Bk");
        Bk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BkActionPerformed(evt);
            }
        });

        Dy.setText("Dy");
        Dy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DyActionPerformed(evt);
            }
        });

        Cf.setText("Cf");
        Cf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CfActionPerformed(evt);
            }
        });

        Ho.setText("Ho");
        Ho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoActionPerformed(evt);
            }
        });

        Es.setText("Es");
        Es.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EsActionPerformed(evt);
            }
        });

        Er.setText("Er");
        Er.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ErActionPerformed(evt);
            }
        });

        Fm.setText("Fm");
        Fm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FmActionPerformed(evt);
            }
        });

        Tm.setText("Tm");
        Tm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TmActionPerformed(evt);
            }
        });

        Md.setText("Md");
        Md.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MdActionPerformed(evt);
            }
        });

        Yb.setText("Yb");
        Yb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YbActionPerformed(evt);
            }
        });

        No.setText("No");
        No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoActionPerformed(evt);
            }
        });

        Lu.setText("Lu");
        Lu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuActionPerformed(evt);
            }
        });

        Lr.setText("Lr");
        Lr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LrActionPerformed(evt);
            }
        });

        file.setText("File");

        exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        
        log.setText("Show Log");
        log.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logging.showLog();
            }
        });
        file.add(log);
        file.add(exit);
        jMenuBar1.add(file);

        help.setText("Help");

        contents.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        contents.setText("Contents");
        contents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentsActionPerformed(evt);
            }
        });
        help.add(contents);

        about.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        about.setText("About");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
	logging.logIt("Done adding ActionListeners to the components.");
	logging.logIt("Now adding the graphics components to the Frame so that the user can see it.");
        help.add(about);

        jMenuBar1.add(help);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(397, 397, 397))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1002, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Fr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Rb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                            .addComponent(K, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Na, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Li, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(H, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Ca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Mg, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                            .addComponent(Be, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Sr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Ba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Ra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Sc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Y, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(La, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Ac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Hf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Zr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Ti, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Rf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Ce, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Ta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Nb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(V, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(Db, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Th, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Pr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(W, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Mo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cr, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(Sg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Nd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Re, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Tc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Mn, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(Bh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(U, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Pm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Os, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Ru, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Fe, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(Hs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Np, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Sm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Ir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Rh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Co, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(Mt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Pt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Ni, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(Ds, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Eu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Am, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Au, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Ag, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cu, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(Rg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Gd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Hg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Zn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cn, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(Tb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Bk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Al, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Tl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(In, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Ga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Uut, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Dy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Pb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Ge, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Si, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(C, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Fl, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(Ho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Es, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Bi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Sb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(As, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(P, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(N, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Uup, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Po, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Te, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Se, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(S, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(O, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Hv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(At, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(I, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Br, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(F, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Uus, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Rn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Xe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Kr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Ar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Ne, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(He, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Uuo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Fm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Er, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Tm, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Md, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Yb, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(No, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Lu, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(H)
                    .addComponent(He))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Li)
                    .addComponent(Be)
                    .addComponent(B)
                    .addComponent(C)
                    .addComponent(N)
                    .addComponent(O)
                    .addComponent(F)
                    .addComponent(Ne))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Na)
                    .addComponent(Mg)
                    .addComponent(Al)
                    .addComponent(Si)
                    .addComponent(P)
                    .addComponent(S)
                    .addComponent(Cl)
                    .addComponent(Ar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(K)
                    .addComponent(Ca)
                    .addComponent(Sc)
                    .addComponent(Ti)
                    .addComponent(V)
                    .addComponent(Cr)
                    .addComponent(Mn)
                    .addComponent(Fe)
                    .addComponent(Co)
                    .addComponent(Ni)
                    .addComponent(Cu)
                    .addComponent(Zn)
                    .addComponent(Ga)
                    .addComponent(Ge)
                    .addComponent(As)
                    .addComponent(Se)
                    .addComponent(Br)
                    .addComponent(Kr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rb)
                    .addComponent(Sr)
                    .addComponent(Y)
                    .addComponent(Zr)
                    .addComponent(Nb)
                    .addComponent(Mo)
                    .addComponent(Tc)
                    .addComponent(Ru)
                    .addComponent(Rh)
                    .addComponent(Pd)
                    .addComponent(Ag)
                    .addComponent(Cd)
                    .addComponent(In)
                    .addComponent(Sn)
                    .addComponent(Sb)
                    .addComponent(Te)
                    .addComponent(I)
                    .addComponent(Xe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cs)
                    .addComponent(Ba)
                    .addComponent(La)
                    .addComponent(Hf)
                    .addComponent(Ta)
                    .addComponent(W)
                    .addComponent(Re)
                    .addComponent(Os)
                    .addComponent(Ir)
                    .addComponent(Pt)
                    .addComponent(Au)
                    .addComponent(Hg)
                    .addComponent(Tl)
                    .addComponent(Pb)
                    .addComponent(Bi)
                    .addComponent(Po)
                    .addComponent(At)
                    .addComponent(Rn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Fr)
                        .addComponent(Ra)
                        .addComponent(Ac)
                        .addComponent(Rf))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Db)
                        .addComponent(Sg)
                        .addComponent(Bh)
                        .addComponent(Hs)
                        .addComponent(Mt)
                        .addComponent(Ds)
                        .addComponent(Rg)
                        .addComponent(Cn)
                        .addComponent(Uut)
                        .addComponent(Fl)
                        .addComponent(Uup)
                        .addComponent(Hv)
                        .addComponent(Uus)
                        .addComponent(Uuo)))
                .addGap(8, 8, 8)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ce)
                    .addComponent(Pr)
                    .addComponent(Nd)
                    .addComponent(Pm)
                    .addComponent(Sm)
                    .addComponent(Eu)
                    .addComponent(Gd)
                    .addComponent(Tb)
                    .addComponent(Dy)
                    .addComponent(Ho)
                    .addComponent(Er)
                    .addComponent(Tm)
                    .addComponent(Yb)
                    .addComponent(Lu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Th)
                    .addComponent(Pa)
                    .addComponent(U)
                    .addComponent(Np)
                    .addComponent(Pu)
                    .addComponent(Am)
                    .addComponent(Cm)
                    .addComponent(Bk)
                    .addComponent(Cf)
                    .addComponent(Es)
                    .addComponent(Fm)
                    .addComponent(Md)
                    .addComponent(No)
                    .addComponent(Lr)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClActionPerformed
        Elements.showElement("Chlorine.element");        // TODO add your handling code here:
    }//GEN-LAST:event_ClActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        //About about1 = new About(); // TODO add your handling code here:
    }//GEN-LAST:event_aboutActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HActionPerformed
        Elements.showElement("Hydrogen.element");
    }//GEN-LAST:event_HActionPerformed

    private void LiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LiActionPerformed
        Elements.showElement("Lithium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_LiActionPerformed

    private void NaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NaActionPerformed
        Elements.showElement("Sodium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_NaActionPerformed

    private void KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KActionPerformed
        Elements.showElement("Potassium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_KActionPerformed

    private void RbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbActionPerformed
        Elements.showElement("Rubidium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_RbActionPerformed

    private void CsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CsActionPerformed
        Elements.showElement("Caesium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_CsActionPerformed

    private void FrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrActionPerformed
        Elements.showElement("Francium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_FrActionPerformed

    private void BeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeActionPerformed
        Elements.showElement("Beryllium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_BeActionPerformed

    private void MgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MgActionPerformed
        Elements.showElement("Magnesium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_MgActionPerformed

    private void CaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaActionPerformed
        Elements.showElement("Calcium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_CaActionPerformed

    private void SrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SrActionPerformed
        Elements.showElement("Strontium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_SrActionPerformed

    private void BaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaActionPerformed
        Elements.showElement("Barium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_BaActionPerformed

    private void RaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RaActionPerformed
        Elements.showElement("Radium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_RaActionPerformed

    private void ScActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScActionPerformed
        Elements.showElement("Scandium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_ScActionPerformed

    private void YActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YActionPerformed
        Elements.showElement("Yttrium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_YActionPerformed

    private void LaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaActionPerformed
        Elements.showElement("Lanthanum.element");        // TODO add your handling code here:
    }//GEN-LAST:event_LaActionPerformed

    private void AcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcActionPerformed
        Elements.showElement("Actinium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_AcActionPerformed

    private void TiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiActionPerformed
        Elements.showElement("Titanium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_TiActionPerformed

    private void ZrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZrActionPerformed
        Elements.showElement("Zirconium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_ZrActionPerformed

    private void HfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HfActionPerformed
        Elements.showElement("Hafnium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_HfActionPerformed

    private void RfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RfActionPerformed
        Elements.showElement("Rutherfordium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_RfActionPerformed

    private void VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VActionPerformed
        Elements.showElement("Vanadium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_VActionPerformed

    private void NbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NbActionPerformed
        Elements.showElement("Niobium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_NbActionPerformed

    private void TaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaActionPerformed
        Elements.showElement("Tantalum.element");        // TODO add your handling code here:
    }//GEN-LAST:event_TaActionPerformed

    private void DbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DbActionPerformed
        Elements.showElement("Dubnium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_DbActionPerformed

    private void CrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrActionPerformed
        Elements.showElement("Chromium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_CrActionPerformed

    private void MoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoActionPerformed
        Elements.showElement("Molybdenum.element");        // TODO add your handling code here:
    }//GEN-LAST:event_MoActionPerformed

    private void WActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WActionPerformed
        Elements.showElement("Tungsten.element");        // TODO add your handling code here:
    }//GEN-LAST:event_WActionPerformed

    private void SgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SgActionPerformed
        Elements.showElement("Seaborgium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_SgActionPerformed

    private void contentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentsActionPerformed
        //new Contents();        // TODO add your handling code here:
    }//GEN-LAST:event_contentsActionPerformed

    private void MnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnActionPerformed
        Elements.showElement("Manganese.element");        // TODO add your handling code here:
    }//GEN-LAST:event_MnActionPerformed

    private void TcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TcActionPerformed
        Elements.showElement("Technetium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_TcActionPerformed

    private void ReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReActionPerformed
        Elements.showElement("Rhenium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_ReActionPerformed

    private void BhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BhActionPerformed
        Elements.showElement("Bohrium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_BhActionPerformed

    private void FeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeActionPerformed
        Elements.showElement("Iron.element");        // TODO add your handling code here:
    }//GEN-LAST:event_FeActionPerformed

    private void RuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RuActionPerformed
        Elements.showElement("Ruthenium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_RuActionPerformed

    private void OsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OsActionPerformed
        Elements.showElement("Osmium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_OsActionPerformed

    private void HsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HsActionPerformed
        Elements.showElement("Hassium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_HsActionPerformed

    private void CoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoActionPerformed
        Elements.showElement("Cobalt.element");        // TODO add your handling code here:
    }//GEN-LAST:event_CoActionPerformed

    private void RhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RhActionPerformed
        Elements.showElement("Rhodium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_RhActionPerformed

    private void IrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrActionPerformed
        Elements.showElement("Iridium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_IrActionPerformed

    private void MtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MtActionPerformed
        Elements.showElement("Meitnerium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_MtActionPerformed

    private void NiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NiActionPerformed
        Elements.showElement("Nickel.element");        // TODO add your handling code here:
    }//GEN-LAST:event_NiActionPerformed

    private void PdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PdActionPerformed
        Elements.showElement("Palladium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_PdActionPerformed

    private void PtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PtActionPerformed
        Elements.showElement("Platinum.element");        // TODO add your handling code here:
    }//GEN-LAST:event_PtActionPerformed

    private void DsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DsActionPerformed
        Elements.showElement("Dermastadtium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_DsActionPerformed

    private void CuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuActionPerformed
        Elements.showElement("Copper.element");        // TODO add your handling code here:
    }//GEN-LAST:event_CuActionPerformed

    private void AgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgActionPerformed
        Elements.showElement("Silver.element");        // TODO add your handling code here:
    }//GEN-LAST:event_AgActionPerformed

    private void AuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuActionPerformed
        Elements.showElement("Gold.element");        // TODO add your handling code here:
    }//GEN-LAST:event_AuActionPerformed

    private void RgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RgActionPerformed
        Elements.showElement("Roentgenium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_RgActionPerformed

    private void ZnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZnActionPerformed
        Elements.showElement("Zinc.element");        // TODO add your handling code here:
    }//GEN-LAST:event_ZnActionPerformed

    private void CdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CdActionPerformed
        Elements.showElement("Cadmium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_CdActionPerformed

    private void HgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HgActionPerformed
        Elements.showElement("Mercury.element");        // TODO add your handling code here:
    }//GEN-LAST:event_HgActionPerformed

    private void CnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CnActionPerformed
        Elements.showElement("Copernicium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_CnActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        Elements.showElement("Boron.element");        // TODO add your handling code here:
    }//GEN-LAST:event_BActionPerformed

    private void AlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlActionPerformed
        Elements.showElement("Aluminium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_AlActionPerformed

    private void GaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GaActionPerformed
        Elements.showElement("Gallium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_GaActionPerformed

    private void InActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InActionPerformed
        Elements.showElement("Indium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_InActionPerformed

    private void TlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TlActionPerformed
        Elements.showElement("Thallium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_TlActionPerformed

    private void UutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UutActionPerformed
        Elements.showElement("Ununtrium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_UutActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        Elements.showElement("Carbon.element");        // TODO add your handling code here:
    }//GEN-LAST:event_CActionPerformed

    private void SiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiActionPerformed
        Elements.showElement("Silicon.element");        // TODO add your handling code here:
    }//GEN-LAST:event_SiActionPerformed

    private void GeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeActionPerformed
        Elements.showElement("Germanium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_GeActionPerformed

    private void SnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SnActionPerformed
        Elements.showElement("Tin.element");        // TODO add your handling code here:
    }//GEN-LAST:event_SnActionPerformed

    private void PbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PbActionPerformed
        Elements.showElement("Lead.element");        // TODO add your handling code here:
    }//GEN-LAST:event_PbActionPerformed

    private void FlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlActionPerformed
        Elements.showElement("Flerovium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_FlActionPerformed

    private void NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NActionPerformed
        Elements.showElement("Nitrogen.element");        // TODO add your handling code here:
    }//GEN-LAST:event_NActionPerformed

    private void PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PActionPerformed
        Elements.showElement("Phosphorus.element");        // TODO add your handling code here:
    }//GEN-LAST:event_PActionPerformed

    private void AsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsActionPerformed
        Elements.showElement("Arsenic.element");        // TODO add your handling code here:
    }//GEN-LAST:event_AsActionPerformed

    private void SbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SbActionPerformed
        Elements.showElement("Antimony.element");        // TODO add your handling code here:
    }//GEN-LAST:event_SbActionPerformed

    private void BiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BiActionPerformed
        Elements.showElement("Bismuth.element");        // TODO add your handling code here:
    }//GEN-LAST:event_BiActionPerformed

    private void UupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UupActionPerformed
        Elements.showElement("Ununpentium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_UupActionPerformed

    private void OActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OActionPerformed
        Elements.showElement("Oxygen.element");        // TODO add your handling code here:
    }//GEN-LAST:event_OActionPerformed

    private void SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SActionPerformed
        Elements.showElement("Sulphur.element");        // TODO add your handling code here:
    }//GEN-LAST:event_SActionPerformed

    private void SeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeActionPerformed
        Elements.showElement("Selenium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_SeActionPerformed

    private void TeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeActionPerformed
        Elements.showElement("Tellurium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_TeActionPerformed

    private void PoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PoActionPerformed
        Elements.showElement("Polonium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_PoActionPerformed

    private void HvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HvActionPerformed
        Elements.showElement("Livermorium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_HvActionPerformed

    private void FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FActionPerformed
        Elements.showElement("Fluorine.element");        // TODO add your handling code here:
    }//GEN-LAST:event_FActionPerformed

    private void BrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrActionPerformed
        Elements.showElement("Bromine.element");        // TODO add your handling code here:
    }//GEN-LAST:event_BrActionPerformed

    private void IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IActionPerformed
        Elements.showElement("Iodine.element");        // TODO add your handling code here:
    }//GEN-LAST:event_IActionPerformed

    private void AtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtActionPerformed
        Elements.showElement("Astatine.element");        // TODO add your handling code here:
    }//GEN-LAST:event_AtActionPerformed

    private void UusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UusActionPerformed
        Elements.showElement("Ununseptium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_UusActionPerformed

    private void HeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeActionPerformed
        Elements.showElement("Helium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_HeActionPerformed

    private void NeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NeActionPerformed
        Elements.showElement("Neon.element");        // TODO add your handling code here:
    }//GEN-LAST:event_NeActionPerformed

    private void ArActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArActionPerformed
        Elements.showElement("Argon.element");        // TODO add your handling code here:
    }//GEN-LAST:event_ArActionPerformed

    private void KrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KrActionPerformed
        Elements.showElement("Krypton.element");        // TODO add your handling code here:
    }//GEN-LAST:event_KrActionPerformed

    private void XeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XeActionPerformed
        Elements.showElement("Xenon.element");        // TODO add your handling code here:
    }//GEN-LAST:event_XeActionPerformed

    private void RnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RnActionPerformed
        Elements.showElement("Randon.element");        // TODO add your handling code here:
    }//GEN-LAST:event_RnActionPerformed

    private void UuoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UuoActionPerformed
        Elements.showElement("Ununoctium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_UuoActionPerformed

    private void CeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CeActionPerformed
        Elements.showElement("Cerium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_CeActionPerformed

    private void ThActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThActionPerformed
        Elements.showElement("Thorium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_ThActionPerformed

    private void PrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrActionPerformed
        Elements.showElement("Praseodymium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_PrActionPerformed

    private void PaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaActionPerformed
        Elements.showElement("Praseodymium.element");      // TODO add your handling code here:
    }//GEN-LAST:event_PaActionPerformed

    private void NdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NdActionPerformed
        Elements.showElement("Neodymium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_NdActionPerformed

    private void UActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UActionPerformed
        Elements.showElement("Uranium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_UActionPerformed

    private void PmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PmActionPerformed
        Elements.showElement("Promethium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_PmActionPerformed

    private void NpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NpActionPerformed
        Elements.showElement("Neptunium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_NpActionPerformed

    private void SmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SmActionPerformed
        Elements.showElement("Samarium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_SmActionPerformed

    private void PuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuActionPerformed
        Elements.showElement("Plutonium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_PuActionPerformed

    private void EuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EuActionPerformed
        Elements.showElement("Europium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_EuActionPerformed

    private void AmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmActionPerformed
        Elements.showElement("Americum.element");        // TODO add your handling code here:
    }//GEN-LAST:event_AmActionPerformed

    private void GdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GdActionPerformed
        Elements.showElement("Gadolinium.element");      // TODO add your handling code here:
    }//GEN-LAST:event_GdActionPerformed

    private void CmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmActionPerformed
        Elements.showElement("Curium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_CmActionPerformed

    private void TbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TbActionPerformed
        Elements.showElement("Terbium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_TbActionPerformed

    private void BkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BkActionPerformed
        Elements.showElement("Berkelium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_BkActionPerformed

    private void DyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DyActionPerformed
        Elements.showElement("Dysprosium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_DyActionPerformed

    private void CfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CfActionPerformed
        Elements.showElement("Californium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_CfActionPerformed

    private void HoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoActionPerformed
        Elements.showElement("Holmium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_HoActionPerformed

    private void EsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EsActionPerformed
        Elements.showElement("Einsteinium.element");       // TODO add your handling code here:
    }//GEN-LAST:event_EsActionPerformed

    private void ErActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ErActionPerformed
        Elements.showElement("Erbium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_ErActionPerformed

    private void FmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FmActionPerformed
        Elements.showElement("Fermium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_FmActionPerformed

    private void TmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TmActionPerformed
        Elements.showElement("Thulium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_TmActionPerformed

    private void MdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MdActionPerformed
        Elements.showElement("Mendelevium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_MdActionPerformed

    private void YbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YbActionPerformed
        Elements.showElement("Ytterbium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_YbActionPerformed

    private void NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoActionPerformed
        Elements.showElement("Nobelium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_NoActionPerformed

    private void LuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuActionPerformed
        Elements.showElement("Lutetium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_LuActionPerformed

    private void LrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LrActionPerformed
        Elements.showElement("Lawrencium.element");        // TODO add your handling code here:
    }//GEN-LAST:event_LrActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                //System.out.println(info.getName());
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
		    logging.logIt("Setting the default look and feel to " + info.getName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ac;
    private javax.swing.JButton Ag;
    private javax.swing.JButton Al;
    private javax.swing.JButton Am;
    private javax.swing.JButton Ar;
    private javax.swing.JButton As;
    private javax.swing.JButton At;
    private javax.swing.JButton Au;
    private javax.swing.JButton B;
    private javax.swing.JButton Ba;
    private javax.swing.JButton Be;
    private javax.swing.JButton Bh;
    private javax.swing.JButton Bi;
    private javax.swing.JButton Bk;
    private javax.swing.JButton Br;
    private javax.swing.JButton C;
    private javax.swing.JButton Ca;
    private javax.swing.JButton Cd;
    private javax.swing.JButton Ce;
    private javax.swing.JButton Cf;
    private javax.swing.JButton Cl;
    private javax.swing.JButton Cm;
    private javax.swing.JButton Cn;
    private javax.swing.JButton Co;
    private javax.swing.JButton Cr;
    private javax.swing.JButton Cs;
    private javax.swing.JButton Cu;
    private javax.swing.JButton Db;
    private javax.swing.JButton Ds;
    private javax.swing.JButton Dy;
    private javax.swing.JButton Er;
    private javax.swing.JButton Es;
    private javax.swing.JButton Eu;
    private javax.swing.JButton F;
    private javax.swing.JButton Fe;
    private javax.swing.JButton Fl;
    private javax.swing.JButton Fm;
    private javax.swing.JButton Fr;
    private javax.swing.JButton Ga;
    private javax.swing.JButton Gd;
    private javax.swing.JButton Ge;
    private javax.swing.JButton H;
    private javax.swing.JButton He;
    private javax.swing.JButton Hf;
    private javax.swing.JButton Hg;
    private javax.swing.JButton Ho;
    private javax.swing.JButton Hs;
    private javax.swing.JButton Hv;
    private javax.swing.JButton I;
    private javax.swing.JButton In;
    private javax.swing.JButton Ir;
    private javax.swing.JButton K;
    private javax.swing.JButton Kr;
    private javax.swing.JButton La;
    private javax.swing.JButton Li;
    private javax.swing.JButton Lr;
    private javax.swing.JButton Lu;
    private javax.swing.JButton Md;
    private javax.swing.JButton Mg;
    private javax.swing.JButton Mn;
    private javax.swing.JButton Mo;
    private javax.swing.JButton Mt;
    private javax.swing.JButton N;
    private javax.swing.JButton Na;
    private javax.swing.JButton Nb;
    private javax.swing.JButton Nd;
    private javax.swing.JButton Ne;
    private javax.swing.JButton Ni;
    private javax.swing.JButton No;
    private javax.swing.JButton Np;
    private javax.swing.JButton O;
    private javax.swing.JButton Os;
    private javax.swing.JButton P;
    private javax.swing.JButton Pa;
    private javax.swing.JButton Pb;
    private javax.swing.JButton Pd;
    private javax.swing.JButton Pm;
    private javax.swing.JButton Po;
    private javax.swing.JButton Pr;
    private javax.swing.JButton Pt;
    private javax.swing.JButton Pu;
    private javax.swing.JButton Ra;
    private javax.swing.JButton Rb;
    private javax.swing.JButton Re;
    private javax.swing.JButton Rf;
    private javax.swing.JButton Rg;
    private javax.swing.JButton Rh;
    private javax.swing.JButton Rn;
    private javax.swing.JButton Ru;
    private javax.swing.JButton S;
    private javax.swing.JButton Sb;
    private javax.swing.JButton Sc;
    private javax.swing.JButton Se;
    private javax.swing.JButton Sg;
    private javax.swing.JButton Si;
    private javax.swing.JButton Sm;
    private javax.swing.JButton Sn;
    private javax.swing.JButton Sr;
    private javax.swing.JButton Ta;
    private javax.swing.JButton Tb;
    private javax.swing.JButton Tc;
    private javax.swing.JButton Te;
    private javax.swing.JButton Th;
    private javax.swing.JButton Ti;
    private javax.swing.JButton Tl;
    private javax.swing.JButton Tm;
    private javax.swing.JButton U;
    private javax.swing.JButton Uuo;
    private javax.swing.JButton Uup;
    private javax.swing.JButton Uus;
    private javax.swing.JButton Uut;
    private javax.swing.JButton V;
    private javax.swing.JButton W;
    private javax.swing.JButton Xe;
    private javax.swing.JButton Y;
    private javax.swing.JButton Yb;
    private javax.swing.JButton Zn;
    private javax.swing.JButton Zr;
    private javax.swing.JMenuItem about;
    private javax.swing.JMenuItem contents;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu file;
    private javax.swing.JMenu help;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem log;
    // End of variables declaration//GEN-END:variables
}
