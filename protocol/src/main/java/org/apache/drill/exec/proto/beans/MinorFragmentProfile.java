/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!
// Generated from protobuf

package org.apache.drill.exec.proto.beans;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

import com.dyuproject.protostuff.GraphIOUtil;
import com.dyuproject.protostuff.Input;
import com.dyuproject.protostuff.Message;
import com.dyuproject.protostuff.Output;
import com.dyuproject.protostuff.Schema;

public final class MinorFragmentProfile implements Externalizable, Message<MinorFragmentProfile>, Schema<MinorFragmentProfile>
{

    public static Schema<MinorFragmentProfile> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static MinorFragmentProfile getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final MinorFragmentProfile DEFAULT_INSTANCE = new MinorFragmentProfile();

    
    private FragmentState state;
    private DrillPBError error;
    private int minorFragmentId;
    private List<OperatorProfile> operatorProfile;
    private long startTime;
    private long endTime;
    private long memoryUsed;
    private long maxMemoryUsed;
    private DrillbitEndpoint endpoint;

    public MinorFragmentProfile()
    {
        
    }

    // getters and setters

    // state

    public FragmentState getState()
    {
        return state == null ? FragmentState.SENDING : state;
    }

    public MinorFragmentProfile setState(FragmentState state)
    {
        this.state = state;
        return this;
    }

    // error

    public DrillPBError getError()
    {
        return error;
    }

    public MinorFragmentProfile setError(DrillPBError error)
    {
        this.error = error;
        return this;
    }

    // minorFragmentId

    public int getMinorFragmentId()
    {
        return minorFragmentId;
    }

    public MinorFragmentProfile setMinorFragmentId(int minorFragmentId)
    {
        this.minorFragmentId = minorFragmentId;
        return this;
    }

    // operatorProfile

    public List<OperatorProfile> getOperatorProfileList()
    {
        return operatorProfile;
    }

    public MinorFragmentProfile setOperatorProfileList(List<OperatorProfile> operatorProfile)
    {
        this.operatorProfile = operatorProfile;
        return this;
    }

    // startTime

    public long getStartTime()
    {
        return startTime;
    }

    public MinorFragmentProfile setStartTime(long startTime)
    {
        this.startTime = startTime;
        return this;
    }

    // endTime

    public long getEndTime()
    {
        return endTime;
    }

    public MinorFragmentProfile setEndTime(long endTime)
    {
        this.endTime = endTime;
        return this;
    }

    // memoryUsed

    public long getMemoryUsed()
    {
        return memoryUsed;
    }

    public MinorFragmentProfile setMemoryUsed(long memoryUsed)
    {
        this.memoryUsed = memoryUsed;
        return this;
    }

    // maxMemoryUsed

    public long getMaxMemoryUsed()
    {
        return maxMemoryUsed;
    }

    public MinorFragmentProfile setMaxMemoryUsed(long maxMemoryUsed)
    {
        this.maxMemoryUsed = maxMemoryUsed;
        return this;
    }

    // endpoint

    public DrillbitEndpoint getEndpoint()
    {
        return endpoint;
    }

    public MinorFragmentProfile setEndpoint(DrillbitEndpoint endpoint)
    {
        this.endpoint = endpoint;
        return this;
    }

    // java serialization

    public void readExternal(ObjectInput in) throws IOException
    {
        GraphIOUtil.mergeDelimitedFrom(in, this, this);
    }

    public void writeExternal(ObjectOutput out) throws IOException
    {
        GraphIOUtil.writeDelimitedTo(out, this, this);
    }

    // message method

    public Schema<MinorFragmentProfile> cachedSchema()
    {
        return DEFAULT_INSTANCE;
    }

    // schema methods

    public MinorFragmentProfile newMessage()
    {
        return new MinorFragmentProfile();
    }

    public Class<MinorFragmentProfile> typeClass()
    {
        return MinorFragmentProfile.class;
    }

    public String messageName()
    {
        return MinorFragmentProfile.class.getSimpleName();
    }

    public String messageFullName()
    {
        return MinorFragmentProfile.class.getName();
    }

    public boolean isInitialized(MinorFragmentProfile message)
    {
        return true;
    }

    public void mergeFrom(Input input, MinorFragmentProfile message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                case 1:
                    message.state = FragmentState.valueOf(input.readEnum());
                    break;
                case 2:
                    message.error = input.mergeObject(message.error, DrillPBError.getSchema());
                    break;

                case 3:
                    message.minorFragmentId = input.readInt32();
                    break;
                case 4:
                    if(message.operatorProfile == null)
                        message.operatorProfile = new ArrayList<OperatorProfile>();
                    message.operatorProfile.add(input.mergeObject(null, OperatorProfile.getSchema()));
                    break;

                case 5:
                    message.startTime = input.readInt64();
                    break;
                case 6:
                    message.endTime = input.readInt64();
                    break;
                case 7:
                    message.memoryUsed = input.readInt64();
                    break;
                case 8:
                    message.maxMemoryUsed = input.readInt64();
                    break;
                case 9:
                    message.endpoint = input.mergeObject(message.endpoint, DrillbitEndpoint.getSchema());
                    break;

                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, MinorFragmentProfile message) throws IOException
    {
        if(message.state != null)
             output.writeEnum(1, message.state.number, false);

        if(message.error != null)
             output.writeObject(2, message.error, DrillPBError.getSchema(), false);


        if(message.minorFragmentId != 0)
            output.writeInt32(3, message.minorFragmentId, false);

        if(message.operatorProfile != null)
        {
            for(OperatorProfile operatorProfile : message.operatorProfile)
            {
                if(operatorProfile != null)
                    output.writeObject(4, operatorProfile, OperatorProfile.getSchema(), true);
            }
        }


        if(message.startTime != 0)
            output.writeInt64(5, message.startTime, false);

        if(message.endTime != 0)
            output.writeInt64(6, message.endTime, false);

        if(message.memoryUsed != 0)
            output.writeInt64(7, message.memoryUsed, false);

        if(message.maxMemoryUsed != 0)
            output.writeInt64(8, message.maxMemoryUsed, false);

        if(message.endpoint != null)
             output.writeObject(9, message.endpoint, DrillbitEndpoint.getSchema(), false);

    }

    public String getFieldName(int number)
    {
        switch(number)
        {
            case 1: return "state";
            case 2: return "error";
            case 3: return "minorFragmentId";
            case 4: return "operatorProfile";
            case 5: return "startTime";
            case 6: return "endTime";
            case 7: return "memoryUsed";
            case 8: return "maxMemoryUsed";
            case 9: return "endpoint";
            default: return null;
        }
    }

    public int getFieldNumber(String name)
    {
        final Integer number = __fieldMap.get(name);
        return number == null ? 0 : number.intValue();
    }

    private static final java.util.HashMap<String,Integer> __fieldMap = new java.util.HashMap<String,Integer>();
    static
    {
        __fieldMap.put("state", 1);
        __fieldMap.put("error", 2);
        __fieldMap.put("minorFragmentId", 3);
        __fieldMap.put("operatorProfile", 4);
        __fieldMap.put("startTime", 5);
        __fieldMap.put("endTime", 6);
        __fieldMap.put("memoryUsed", 7);
        __fieldMap.put("maxMemoryUsed", 8);
        __fieldMap.put("endpoint", 9);
    }
    
}
