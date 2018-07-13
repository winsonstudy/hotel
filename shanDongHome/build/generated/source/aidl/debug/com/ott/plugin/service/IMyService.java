/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: E:\\workspace\\studio\\shangdong\\shanDongHome\\src\\main\\aidl\\com\\ott\\plugin\\service\\IMyService.aidl
 */
package com.ott.plugin.service;
public interface IMyService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.ott.plugin.service.IMyService
{
private static final java.lang.String DESCRIPTOR = "com.ott.plugin.service.IMyService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.ott.plugin.service.IMyService interface,
 * generating a proxy if needed.
 */
public static com.ott.plugin.service.IMyService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.ott.plugin.service.IMyService))) {
return ((com.ott.plugin.service.IMyService)iin);
}
return new com.ott.plugin.service.IMyService.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_Authentication:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.Authentication(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_QueryUserInfo:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.QueryUserInfo(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_ValidatePassword:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.ValidatePassword(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_UpdatePassword:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.UpdatePassword(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_FindPassword:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.FindPassword(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_QueryOrderList:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.QueryOrderList(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_Unsubscribe:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.Unsubscribe(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_QueryBilldetail:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.QueryBilldetail(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_BindMobile:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.BindMobile(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_GetArea:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.GetArea(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_ValueAddedOrder:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.ValueAddedOrder(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_OrderContinue:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.OrderContinue(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_SetExtData:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
int _result = this.SetExtData(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_OpenMulticast:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.OpenMulticast(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_Idtification:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.Idtification(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_GetTradeName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.GetTradeName(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_TradeReport:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.TradeReport(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_UpdateChildLockPassword:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.UpdateChildLockPassword(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getMultiParams:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getMultiParams(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getIPTVPlayUrl:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getIPTVPlayUrl(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.ott.plugin.service.IMyService
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public java.lang.String Authentication(java.lang.String jsonStr) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(jsonStr);
mRemote.transact(Stub.TRANSACTION_Authentication, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String QueryUserInfo(java.lang.String jsonStr) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(jsonStr);
mRemote.transact(Stub.TRANSACTION_QueryUserInfo, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String ValidatePassword(java.lang.String jsonStr) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(jsonStr);
mRemote.transact(Stub.TRANSACTION_ValidatePassword, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String UpdatePassword(java.lang.String jsonStr) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(jsonStr);
mRemote.transact(Stub.TRANSACTION_UpdatePassword, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String FindPassword(java.lang.String jsonStr) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(jsonStr);
mRemote.transact(Stub.TRANSACTION_FindPassword, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String QueryOrderList(java.lang.String jsonStr) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(jsonStr);
mRemote.transact(Stub.TRANSACTION_QueryOrderList, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String Unsubscribe(java.lang.String jsonStr) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(jsonStr);
mRemote.transact(Stub.TRANSACTION_Unsubscribe, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String QueryBilldetail(java.lang.String jsonStr) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(jsonStr);
mRemote.transact(Stub.TRANSACTION_QueryBilldetail, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String BindMobile(java.lang.String jsonStr) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(jsonStr);
mRemote.transact(Stub.TRANSACTION_BindMobile, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String GetArea(java.lang.String jsonStr) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(jsonStr);
mRemote.transact(Stub.TRANSACTION_GetArea, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String ValueAddedOrder(java.lang.String jsonStr) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(jsonStr);
mRemote.transact(Stub.TRANSACTION_ValueAddedOrder, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String OrderContinue(java.lang.String jsonStr) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(jsonStr);
mRemote.transact(Stub.TRANSACTION_OrderContinue, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int SetExtData(java.lang.String source, java.lang.String key, java.lang.String data) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(source);
_data.writeString(key);
_data.writeString(data);
mRemote.transact(Stub.TRANSACTION_SetExtData, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String OpenMulticast(java.lang.String jsonStr) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(jsonStr);
mRemote.transact(Stub.TRANSACTION_OpenMulticast, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String Idtification(java.lang.String jsonStr) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(jsonStr);
mRemote.transact(Stub.TRANSACTION_Idtification, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String GetTradeName(java.lang.String jsonStr) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(jsonStr);
mRemote.transact(Stub.TRANSACTION_GetTradeName, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String TradeReport(java.lang.String jsonStr) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(jsonStr);
mRemote.transact(Stub.TRANSACTION_TradeReport, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String UpdateChildLockPassword(java.lang.String jsonStr) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(jsonStr);
mRemote.transact(Stub.TRANSACTION_UpdateChildLockPassword, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getMultiParams(java.lang.String jsonStr) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(jsonStr);
mRemote.transact(Stub.TRANSACTION_getMultiParams, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getIPTVPlayUrl(java.lang.String jsonStr) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(jsonStr);
mRemote.transact(Stub.TRANSACTION_getIPTVPlayUrl, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_Authentication = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_QueryUserInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_ValidatePassword = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_UpdatePassword = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_FindPassword = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_QueryOrderList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_Unsubscribe = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_QueryBilldetail = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_BindMobile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_GetArea = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_ValueAddedOrder = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_OrderContinue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_SetExtData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_OpenMulticast = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_Idtification = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_GetTradeName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_TradeReport = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_UpdateChildLockPassword = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_getMultiParams = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_getIPTVPlayUrl = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
}
public java.lang.String Authentication(java.lang.String jsonStr) throws android.os.RemoteException;
public java.lang.String QueryUserInfo(java.lang.String jsonStr) throws android.os.RemoteException;
public java.lang.String ValidatePassword(java.lang.String jsonStr) throws android.os.RemoteException;
public java.lang.String UpdatePassword(java.lang.String jsonStr) throws android.os.RemoteException;
public java.lang.String FindPassword(java.lang.String jsonStr) throws android.os.RemoteException;
public java.lang.String QueryOrderList(java.lang.String jsonStr) throws android.os.RemoteException;
public java.lang.String Unsubscribe(java.lang.String jsonStr) throws android.os.RemoteException;
public java.lang.String QueryBilldetail(java.lang.String jsonStr) throws android.os.RemoteException;
public java.lang.String BindMobile(java.lang.String jsonStr) throws android.os.RemoteException;
public java.lang.String GetArea(java.lang.String jsonStr) throws android.os.RemoteException;
public java.lang.String ValueAddedOrder(java.lang.String jsonStr) throws android.os.RemoteException;
public java.lang.String OrderContinue(java.lang.String jsonStr) throws android.os.RemoteException;
public int SetExtData(java.lang.String source, java.lang.String key, java.lang.String data) throws android.os.RemoteException;
public java.lang.String OpenMulticast(java.lang.String jsonStr) throws android.os.RemoteException;
public java.lang.String Idtification(java.lang.String jsonStr) throws android.os.RemoteException;
public java.lang.String GetTradeName(java.lang.String jsonStr) throws android.os.RemoteException;
public java.lang.String TradeReport(java.lang.String jsonStr) throws android.os.RemoteException;
public java.lang.String UpdateChildLockPassword(java.lang.String jsonStr) throws android.os.RemoteException;
public java.lang.String getMultiParams(java.lang.String jsonStr) throws android.os.RemoteException;
public java.lang.String getIPTVPlayUrl(java.lang.String jsonStr) throws android.os.RemoteException;
}
