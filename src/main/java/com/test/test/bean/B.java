package com.test.test.bean;

import java.util.List;

public class B {

    /**
     * HEAD : {"ACTION_CODE":{"ACTION_CODE":"1"},"RET_CODE":{"RET_CODE":"0000"},"BUSI_CODE":{"BUSI_CODE":"QUERYCUST"},"RET_MSG":{"RET_MSG":"success"},"ORIGIN_DOMAIN":{"ORIGIN_DOMAIN":"kefuxitongbianma"},"HOME_DOMAIN":{"HOME_DOMAIN":"CUGCRM"},"TRANS_ID":{"TRANS_ID":"20160220160635123456"}}
     * BODY : {"CUSTINFOLIST":{"CUSTINFO":[{"VIP_FLAG":{"VIP_FLAG":"true"},"CUST_TYPE":{"CUST_TYPE":"001"}},{"VIP_FLAG":{"VIP_FLAG":"false"},"CUST_TYPE":{"CUST_TYPE":"002"}},{"VIP_FLAG":{"VIP_FLAG":"false"},"CUST_TYPE":{"CUST_TYPE":"003"}}]},"TOTAL_RECORDS":{"TOTAL_RECORDS":"20"},"TOTAL_PAGE":{"TOTAL_PAGE":"10"},"CURRENT_PAGE":{"CURRENT_PAGE":"1"}}
     */

    private HEADBean HEAD;
    private BODYBean BODY;


    public HEADBean getHEAD() {
        return HEAD;
    }

    public void setHEAD(HEADBean HEAD) {
        this.HEAD = HEAD;
    }

    public BODYBean getBODY() {
        return BODY;
    }

    public void setBODY(BODYBean BODY) {
        this.BODY = BODY;
    }

    @Override
    public String toString() {
        return "B" +
                "HEAD=" + HEAD.toString() +
                ", BODY=" + BODY.toString() +
                '}';
    }


    public class HEADBean {
        /**
         * ACTION_CODE : {"ACTION_CODE":"1"}
         * RET_CODE : {"RET_CODE":"0000"}
         * BUSI_CODE : {"BUSI_CODE":"QUERYCUST"}
         * RET_MSG : {"RET_MSG":"success"}
         * ORIGIN_DOMAIN : {"ORIGIN_DOMAIN":"kefuxitongbianma"}
         * HOME_DOMAIN : {"HOME_DOMAIN":"CUGCRM"}
         * TRANS_ID : {"TRANS_ID":"20160220160635123456"}
         */

        private ACTIONCODEBean ACTION_CODE;
        private RETCODEBean RET_CODE;
        private BUSICODEBean BUSI_CODE;
        private RETMSGBean RET_MSG;
        private ORIGINDOMAINBean ORIGIN_DOMAIN;
        private HOMEDOMAINBean HOME_DOMAIN;
        private TRANSIDBean TRANS_ID;

        public ACTIONCODEBean getACTION_CODE() {
            return ACTION_CODE;
        }

        public void setACTION_CODE(ACTIONCODEBean ACTION_CODE) {
            this.ACTION_CODE = ACTION_CODE;
        }

        public RETCODEBean getRET_CODE() {
            return RET_CODE;
        }

        public void setRET_CODE(RETCODEBean RET_CODE) {
            this.RET_CODE = RET_CODE;
        }

        public BUSICODEBean getBUSI_CODE() {
            return BUSI_CODE;
        }

        public void setBUSI_CODE(BUSICODEBean BUSI_CODE) {
            this.BUSI_CODE = BUSI_CODE;
        }

        public RETMSGBean getRET_MSG() {
            return RET_MSG;
        }

        public void setRET_MSG(RETMSGBean RET_MSG) {
            this.RET_MSG = RET_MSG;
        }

        public ORIGINDOMAINBean getORIGIN_DOMAIN() {
            return ORIGIN_DOMAIN;
        }

        public void setORIGIN_DOMAIN(ORIGINDOMAINBean ORIGIN_DOMAIN) {
            this.ORIGIN_DOMAIN = ORIGIN_DOMAIN;
        }

        public HOMEDOMAINBean getHOME_DOMAIN() {
            return HOME_DOMAIN;
        }

        public void setHOME_DOMAIN(HOMEDOMAINBean HOME_DOMAIN) {
            this.HOME_DOMAIN = HOME_DOMAIN;
        }

        public TRANSIDBean getTRANS_ID() {
            return TRANS_ID;
        }

        public void setTRANS_ID(TRANSIDBean TRANS_ID) {
            this.TRANS_ID = TRANS_ID;
        }

        @Override
        public String toString() {
            return "HEADBean{" +
                    "ACTION_CODE=" + ACTION_CODE.toString() +
                    ", RET_CODE=" + RET_CODE.toString() +
                    ", BUSI_CODE=" + BUSI_CODE.toString() +
                    ", RET_MSG=" + RET_MSG.toString() +
                    ", ORIGIN_DOMAIN=" + ORIGIN_DOMAIN.toString() +
                    ", HOME_DOMAIN=" + HOME_DOMAIN.toString() +
                    ", TRANS_ID=" + TRANS_ID.toString() +
                    '}';
        }

        public class ACTIONCODEBean {
            /**
             * ACTION_CODE : 1
             */

            private String ACTION_CODE;

            public String getACTION_CODE() {
                return ACTION_CODE;
            }

            public void setACTION_CODE(String ACTION_CODE) {
                this.ACTION_CODE = ACTION_CODE;
            }

            @Override
            public String toString() {
                return "ACTIONCODEBean{" +
                        "ACTION_CODE='" + ACTION_CODE + '\'' +
                        '}';
            }
        }

        public class RETCODEBean {
            /**
             * RET_CODE : 0000
             */

            private String RET_CODE;

            public String getRET_CODE() {
                return RET_CODE;
            }

            public void setRET_CODE(String RET_CODE) {
                this.RET_CODE = RET_CODE;
            }

            @Override
            public String toString() {
                return "RETCODEBean{" +
                        "RET_CODE='" + RET_CODE + '\'' +
                        '}';
            }
        }

        public class BUSICODEBean {
            /**
             * BUSI_CODE : QUERYCUST
             */

            private String BUSI_CODE;

            public String getBUSI_CODE() {
                return BUSI_CODE;
            }

            public void setBUSI_CODE(String BUSI_CODE) {
                this.BUSI_CODE = BUSI_CODE;
            }

            @Override
            public String toString() {
                return "BUSICODEBean{" +
                        "BUSI_CODE='" + BUSI_CODE + '\'' +
                        '}';
            }
        }

        public class RETMSGBean {
            /**
             * RET_MSG : success
             */

            private String RET_MSG;

            public String getRET_MSG() {
                return RET_MSG;
            }

            public void setRET_MSG(String RET_MSG) {
                this.RET_MSG = RET_MSG;
            }

            @Override
            public String toString() {
                return "RETMSGBean{" +
                        "RET_MSG='" + RET_MSG + '\'' +
                        '}';
            }
        }

        public class ORIGINDOMAINBean {
            /**
             * ORIGIN_DOMAIN : kefuxitongbianma
             */

            private String ORIGIN_DOMAIN;

            public String getORIGIN_DOMAIN() {
                return ORIGIN_DOMAIN;
            }

            public void setORIGIN_DOMAIN(String ORIGIN_DOMAIN) {
                this.ORIGIN_DOMAIN = ORIGIN_DOMAIN;
            }

            @Override
            public String toString() {
                return "ORIGINDOMAINBean{" +
                        "ORIGIN_DOMAIN='" + ORIGIN_DOMAIN + '\'' +
                        '}';
            }
        }

        public class HOMEDOMAINBean {
            /**
             * HOME_DOMAIN : CUGCRM
             */

            private String HOME_DOMAIN;

            public String getHOME_DOMAIN() {
                return HOME_DOMAIN;
            }

            public void setHOME_DOMAIN(String HOME_DOMAIN) {
                this.HOME_DOMAIN = HOME_DOMAIN;
            }

            @Override
            public String toString() {
                return "HOMEDOMAINBean{" +
                        "HOME_DOMAIN='" + HOME_DOMAIN + '\'' +
                        '}';
            }
        }

        public class TRANSIDBean {
            /**
             * TRANS_ID : 20160220160635123456
             */

            private String TRANS_ID;

            public String getTRANS_ID() {
                return TRANS_ID;
            }

            public void setTRANS_ID(String TRANS_ID) {
                this.TRANS_ID = TRANS_ID;
            }

            @Override
            public String toString() {
                return "TRANSIDBean{" +
                        "TRANS_ID='" + TRANS_ID + '\'' +
                        '}';
            }
        }
    }

    public static class BODYBean {
        /**
         * CUSTINFOLIST : {"CUSTINFO":[{"VIP_FLAG":{"VIP_FLAG":"true"},"CUST_TYPE":{"CUST_TYPE":"001"}},{"VIP_FLAG":{"VIP_FLAG":"false"},"CUST_TYPE":{"CUST_TYPE":"002"}},{"VIP_FLAG":{"VIP_FLAG":"false"},"CUST_TYPE":{"CUST_TYPE":"003"}}]}
         * TOTAL_RECORDS : {"TOTAL_RECORDS":"20"}
         * TOTAL_PAGE : {"TOTAL_PAGE":"10"}
         * CURRENT_PAGE : {"CURRENT_PAGE":"1"}
         */

        private CUSTINFOLISTBean CUSTINFOLIST;
        private TOTALRECORDSBean TOTAL_RECORDS;
        private TOTALPAGEBean TOTAL_PAGE;
        private CURRENTPAGEBean CURRENT_PAGE;

        public CUSTINFOLISTBean getCUSTINFOLIST() {
            return CUSTINFOLIST;
        }

        public void setCUSTINFOLIST(CUSTINFOLISTBean CUSTINFOLIST) {
            this.CUSTINFOLIST = CUSTINFOLIST;
        }

        public TOTALRECORDSBean getTOTAL_RECORDS() {
            return TOTAL_RECORDS;
        }

        public void setTOTAL_RECORDS(TOTALRECORDSBean TOTAL_RECORDS) {
            this.TOTAL_RECORDS = TOTAL_RECORDS;
        }

        public TOTALPAGEBean getTOTAL_PAGE() {
            return TOTAL_PAGE;
        }

        public void setTOTAL_PAGE(TOTALPAGEBean TOTAL_PAGE) {
            this.TOTAL_PAGE = TOTAL_PAGE;
        }

        public CURRENTPAGEBean getCURRENT_PAGE() {
            return CURRENT_PAGE;
        }

        public void setCURRENT_PAGE(CURRENTPAGEBean CURRENT_PAGE) {
            this.CURRENT_PAGE = CURRENT_PAGE;
        }

        @Override
        public String toString() {
            return "BODYBean{" +
                    "CUSTINFOLIST=" + CUSTINFOLIST.toString() +
                    ", TOTAL_RECORDS=" + TOTAL_RECORDS +
                    ", TOTAL_PAGE=" + TOTAL_PAGE +
                    ", CURRENT_PAGE=" + CURRENT_PAGE +
                    '}';
        }

        public static class CUSTINFOLISTBean {
            private List<CUSTINFOBean> CUSTINFO;

            public List<CUSTINFOBean> getCUSTINFO() {
                return CUSTINFO;
            }

            public void setCUSTINFO(List<CUSTINFOBean> CUSTINFO) {
                this.CUSTINFO = CUSTINFO;
            }

            @Override
            public String toString() {
                return "CUSTINFOLISTBean{" +
                        "CUSTINFO=" + CUSTINFO.toString() +
                        '}';
            }

            public static class CUSTINFOBean {
                /**
                 * VIP_FLAG : {"VIP_FLAG":"true"}
                 * CUST_TYPE : {"CUST_TYPE":"001"}
                 */

                private VIPFLAGBean VIP_FLAG;
                private CUSTTYPEBean CUST_TYPE;

                public VIPFLAGBean getVIP_FLAG() {
                    return VIP_FLAG;
                }

                public void setVIP_FLAG(VIPFLAGBean VIP_FLAG) {
                    this.VIP_FLAG = VIP_FLAG;
                }

                public CUSTTYPEBean getCUST_TYPE() {
                    return CUST_TYPE;
                }

                public void setCUST_TYPE(CUSTTYPEBean CUST_TYPE) {
                    this.CUST_TYPE = CUST_TYPE;
                }

                @Override
                public String toString() {
                    return "CUSTINFOBean{" +
                            "VIP_FLAG=" + VIP_FLAG +
                            ", CUST_TYPE=" + CUST_TYPE +
                            '}';
                }

                public static class VIPFLAGBean {
                    /**
                     * VIP_FLAG : true
                     */

                    private String VIP_FLAG;

                    public String getVIP_FLAG() {
                        return VIP_FLAG;
                    }

                    public void setVIP_FLAG(String VIP_FLAG) {
                        this.VIP_FLAG = VIP_FLAG;
                    }

                    @Override
                    public String toString() {
                        return "VIPFLAGBean{" +
                                "VIP_FLAG='" + VIP_FLAG + '\'' +
                                '}';
                    }
                }

                public static class CUSTTYPEBean {
                    /**
                     * CUST_TYPE : 001
                     */

                    private String CUST_TYPE;

                    public String getCUST_TYPE() {
                        return CUST_TYPE;
                    }

                    public void setCUST_TYPE(String CUST_TYPE) {
                        this.CUST_TYPE = CUST_TYPE;
                    }
                }
            }
        }

        public static class TOTALRECORDSBean {
            /**
             * TOTAL_RECORDS : 20
             */

            private String TOTAL_RECORDS;

            public String getTOTAL_RECORDS() {
                return TOTAL_RECORDS;
            }

            public void setTOTAL_RECORDS(String TOTAL_RECORDS) {
                this.TOTAL_RECORDS = TOTAL_RECORDS;
            }
        }

        public static class TOTALPAGEBean {
            /**
             * TOTAL_PAGE : 10
             */

            private String TOTAL_PAGE;

            public String getTOTAL_PAGE() {
                return TOTAL_PAGE;
            }

            public void setTOTAL_PAGE(String TOTAL_PAGE) {
                this.TOTAL_PAGE = TOTAL_PAGE;
            }
        }

        public static class CURRENTPAGEBean {
            /**
             * CURRENT_PAGE : 1
             */

            private String CURRENT_PAGE;

            public String getCURRENT_PAGE() {
                return CURRENT_PAGE;
            }

            public void setCURRENT_PAGE(String CURRENT_PAGE) {
                this.CURRENT_PAGE = CURRENT_PAGE;
            }
        }
    }
}
