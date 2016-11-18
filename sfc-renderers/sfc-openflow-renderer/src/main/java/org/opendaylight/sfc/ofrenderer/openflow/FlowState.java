/*
 * Copyright (c) 2015 Intel Ltd. and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.sfc.ofrenderer.openflow;

import com.google.common.collect.Iterables;
import org.opendaylight.sfc.provider.api.SfcProviderRenderedPathAPI;
import org.opendaylight.sfc.provider.api.SfcProviderServiceFunctionMetadataAPI;
import org.opendaylight.yang.gen.v1.urn.cisco.params.xml.ns.yang.sfc.common.rev151017.RspName;
import org.opendaylight.yang.gen.v1.urn.cisco.params.xml.ns.yang.sfc.common.rev151017.SffName;
import org.opendaylight.yang.gen.v1.urn.cisco.params.xml.ns.yang.sfc.md.rev140701.service.function.metadata.ContextMetadata;
import org.opendaylight.yang.gen.v1.urn.cisco.params.xml.ns.yang.sfc.rsp.rev140701.rendered.service.path.first.hop.info.RenderedServicePathFirstHop;
import org.opendaylight.yang.gen.v1.urn.cisco.params.xml.ns.yang.sfc.rsp.rev140701.rendered.service.paths.RenderedServicePath;
import org.opendaylight.yang.gen.v1.urn.cisco.params.xml.ns.yang.sfc.rsp.rev140701.rendered.service.paths.rendered.service.path.RenderedServicePathHop;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Ipv4Address;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * This class has some overlap function with SfcProviderRenderedPathAPI.java
 * Todo: will move all functions to SfcProviderRenderedPathAPI.java
 */
public class FlowState {

    private static final Logger LOG = LoggerFactory.getLogger(FlowState.class);

    private int flowStateID;
    private Ipv4Address srcAddess = null;
    private Ipv4Address dstAddess = null;
    private Ipv4Address vxlanIpDst = null;
    private PortNumber vxlanUdpPort = null;
    private int nshNsp;
    private int nshNsi;
    private int nshMetaC1;
    private int nshMetaC2;
    private int nshMetaC3;
    private int nshMetaC4;
    private SffName sffName = null;

    public FlowState() {
    }
    
    

    public FlowState(Ipv4Address vxlanIpDst, PortNumber vxlanUdpPort, int nshNsp,
			int nshNsi, int nshMetaC1, int nshMetaC2, int nshMetaC3, int nshMetaC4, SffName sffName) {
		super();
		this.vxlanIpDst = vxlanIpDst;
		this.vxlanUdpPort = vxlanUdpPort;
		this.nshNsp = nshNsp;
		this.nshNsi = nshNsi;
		this.nshMetaC1 = nshMetaC1;
		this.nshMetaC2 = nshMetaC2;
		this.nshMetaC3 = nshMetaC3;
		this.nshMetaC4 = nshMetaC4;
		this.sffName = sffName;
	}



	public Ipv4Address getVxlanIpDst() {
        return vxlanIpDst;
    }

    public FlowState setVxlanIpDst(Ipv4Address vxlanIpDst) {
        this.vxlanIpDst = vxlanIpDst;
        return this;
    }

    public PortNumber getVxlanUdpPort() {
        return vxlanUdpPort;
    }

    public FlowState setVxlanUdpPort(PortNumber vxlanUdpPort) {
        this.vxlanUdpPort = vxlanUdpPort;
        return this;
    }

    public int getNshNsp() {
        return nshNsp;
    }

    public FlowState setNshNsp(int nshNsp) {
        this.nshNsp = nshNsp;
        return this;
    }

    public SffName getSffName() {
        return sffName;
    }

    public FlowState setSffName(SffName sffName) {
        this.sffName = sffName;
        return this;
    }

	public int getNshNsi() {
		return nshNsi;
	}

	public int getNshMetaC1() {
		return nshMetaC1;
	}

	public int getNshMetaC2() {
		return nshMetaC2;
	}

	public int getNshMetaC3() {
		return nshMetaC3;
	}

	public int getNshMetaC4() {
		return nshMetaC4;
	}



	public Ipv4Address getSrcAddess() {
		return srcAddess;
	}



	public void setSrcAddess(Ipv4Address srcAddess) {
		this.srcAddess = srcAddess;
	}



	public Ipv4Address getDstAddess() {
		return dstAddess;
	}



	public void setDstAddess(Ipv4Address dstAddess) {
		this.dstAddess = dstAddess;
	}



	public void setNshMetaC4(int nshMetaC4) {
		this.nshMetaC4 = nshMetaC4;
	}



	public int getFlowStateID() {
		return flowStateID;
	}



	public void setFlowStateID(int flowStateID) {
		this.flowStateID = flowStateID;
	}
    
}
