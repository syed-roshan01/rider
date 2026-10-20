.class public final Ld/a;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ld/a;->a:I

    return-void
.end method

.method public static a(Lcom/google/android/gms/common/internal/j;Landroid/os/Parcel;I)V
    .locals 4

    const/16 v0, 0x4f45

    invoke-static {v0, p1}, Ly3/e;->Y0(ILandroid/os/Parcel;)I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/common/internal/j;->a:I

    const/4 v2, 0x1

    const/4 v3, 0x4

    invoke-static {p1, v2, v3}, Ly3/e;->f1(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v1, 0x2

    invoke-static {p1, v1, v3}, Ly3/e;->f1(Landroid/os/Parcel;II)V

    iget v1, p0, Lcom/google/android/gms/common/internal/j;->b:I

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v1, 0x3

    invoke-static {p1, v1, v3}, Ly3/e;->f1(Landroid/os/Parcel;II)V

    iget v1, p0, Lcom/google/android/gms/common/internal/j;->c:I

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v1, p0, Lcom/google/android/gms/common/internal/j;->d:Ljava/lang/String;

    invoke-static {p1, v3, v1}, Ly3/e;->T0(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/google/android/gms/common/internal/j;->e:Landroid/os/IBinder;

    invoke-static {p1, v1, v2}, Ly3/e;->M0(Landroid/os/Parcel;ILandroid/os/IBinder;)V

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/google/android/gms/common/internal/j;->f:[Lcom/google/android/gms/common/api/Scope;

    invoke-static {p1, v1, v2, p2}, Ly3/e;->V0(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/google/android/gms/common/internal/j;->n:Landroid/os/Bundle;

    invoke-static {p1, v1, v2}, Ly3/e;->K0(Landroid/os/Parcel;ILandroid/os/Bundle;)V

    const/16 v1, 0x8

    iget-object v2, p0, Lcom/google/android/gms/common/internal/j;->o:Landroid/accounts/Account;

    invoke-static {p1, v1, v2, p2}, Ly3/e;->R0(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/16 v1, 0xa

    iget-object v2, p0, Lcom/google/android/gms/common/internal/j;->p:[Lz5/d;

    invoke-static {p1, v1, v2, p2}, Ly3/e;->V0(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    const/16 v1, 0xb

    iget-object v2, p0, Lcom/google/android/gms/common/internal/j;->q:[Lz5/d;

    invoke-static {p1, v1, v2, p2}, Ly3/e;->V0(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    const/16 p2, 0xc

    invoke-static {p1, p2, v3}, Ly3/e;->f1(Landroid/os/Parcel;II)V

    iget-boolean p2, p0, Lcom/google/android/gms/common/internal/j;->r:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/16 p2, 0xd

    invoke-static {p1, p2, v3}, Ly3/e;->f1(Landroid/os/Parcel;II)V

    iget p2, p0, Lcom/google/android/gms/common/internal/j;->s:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/google/android/gms/common/internal/j;->t:Z

    const/16 v1, 0xe

    invoke-static {p1, v1, v3}, Ly3/e;->f1(Landroid/os/Parcel;II)V

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/16 p2, 0xf

    iget-object p0, p0, Lcom/google/android/gms/common/internal/j;->u:Ljava/lang/String;

    invoke-static {p1, p2, p0}, Ly3/e;->T0(Landroid/os/Parcel;ILjava/lang/String;)V

    invoke-static {v0, p1}, Ly3/e;->d1(ILandroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Ld/a;->a:I

    const-wide/16 v3, 0x0

    const/4 v5, 0x5

    const/4 v6, 0x4

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    packed-switch v2, :pswitch_data_0

    invoke-static/range {p1 .. p1}, Ly3/e;->I0(Landroid/os/Parcel;)I

    move-result v2

    sget-object v3, Lcom/google/android/gms/common/internal/j;->v:[Lcom/google/android/gms/common/api/Scope;

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    sget-object v5, Lcom/google/android/gms/common/internal/j;->w:[Lz5/d;

    move-object/from16 v18, v3

    move-object/from16 v19, v4

    move-object/from16 v21, v5

    move-object/from16 v22, v21

    move-object/from16 v16, v10

    move-object/from16 v17, v16

    move-object/from16 v20, v17

    move-object/from16 v26, v20

    move v13, v11

    move v14, v13

    move v15, v14

    move/from16 v23, v15

    move/from16 v24, v23

    move/from16 v25, v24

    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_0

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    packed-switch v4, :pswitch_data_1

    :pswitch_0
    invoke-static {v3, v1}, Ly3/e;->E0(ILandroid/os/Parcel;)V

    goto :goto_0

    :pswitch_1
    invoke-static {v3, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v26, v3

    goto :goto_0

    :pswitch_2
    invoke-static {v3, v1}, Ly3/e;->p0(ILandroid/os/Parcel;)Z

    move-result v3

    move/from16 v25, v3

    goto :goto_0

    :pswitch_3
    invoke-static {v3, v1}, Ly3/e;->s0(ILandroid/os/Parcel;)I

    move-result v3

    move/from16 v24, v3

    goto :goto_0

    :pswitch_4
    invoke-static {v3, v1}, Ly3/e;->p0(ILandroid/os/Parcel;)Z

    move-result v3

    move/from16 v23, v3

    goto :goto_0

    :pswitch_5
    sget-object v4, Lz5/d;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Ly3/e;->X(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Lz5/d;

    move-object/from16 v22, v3

    goto :goto_0

    :pswitch_6
    sget-object v4, Lz5/d;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Ly3/e;->X(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Lz5/d;

    move-object/from16 v21, v3

    goto :goto_0

    :pswitch_7
    sget-object v4, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Ly3/e;->U(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Landroid/accounts/Account;

    move-object/from16 v20, v3

    goto :goto_0

    :pswitch_8
    invoke-static {v3, v1}, Ly3/e;->S(ILandroid/os/Parcel;)Landroid/os/Bundle;

    move-result-object v3

    move-object/from16 v19, v3

    goto :goto_0

    :pswitch_9
    sget-object v4, Lcom/google/android/gms/common/api/Scope;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Ly3/e;->X(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Lcom/google/android/gms/common/api/Scope;

    move-object/from16 v18, v3

    goto :goto_0

    :pswitch_a
    invoke-static {v3, v1}, Ly3/e;->r0(ILandroid/os/Parcel;)Landroid/os/IBinder;

    move-result-object v3

    move-object/from16 v17, v3

    goto :goto_0

    :pswitch_b
    invoke-static {v3, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v16, v3

    goto :goto_0

    :pswitch_c
    invoke-static {v3, v1}, Ly3/e;->s0(ILandroid/os/Parcel;)I

    move-result v3

    move v15, v3

    goto :goto_0

    :pswitch_d
    invoke-static {v3, v1}, Ly3/e;->s0(ILandroid/os/Parcel;)I

    move-result v3

    move v14, v3

    goto :goto_0

    :pswitch_e
    invoke-static {v3, v1}, Ly3/e;->s0(ILandroid/os/Parcel;)I

    move-result v3

    move v13, v3

    goto/16 :goto_0

    :cond_0
    invoke-static {v2, v1}, Ly3/e;->e0(ILandroid/os/Parcel;)V

    new-instance v1, Lcom/google/android/gms/common/internal/j;

    move-object v12, v1

    invoke-direct/range {v12 .. v26}, Lcom/google/android/gms/common/internal/j;-><init>(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;Landroid/accounts/Account;[Lz5/d;[Lz5/d;ZIZLjava/lang/String;)V

    return-object v1

    :pswitch_f
    invoke-static/range {p1 .. p1}, Ly3/e;->I0(Landroid/os/Parcel;)I

    move-result v2

    move-object v4, v10

    move-object v7, v4

    move-object v9, v7

    move v5, v11

    move v6, v5

    move v8, v6

    :goto_1
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_3

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v11, v3

    packed-switch v11, :pswitch_data_2

    invoke-static {v3, v1}, Ly3/e;->E0(ILandroid/os/Parcel;)V

    goto :goto_1

    :pswitch_10
    invoke-static {v3, v1}, Ly3/e;->z0(ILandroid/os/Parcel;)I

    move-result v3

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v9

    if-nez v3, :cond_1

    move-object v9, v10

    goto :goto_1

    :cond_1
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v11

    add-int/2addr v9, v3

    invoke-virtual {v1, v9}, Landroid/os/Parcel;->setDataPosition(I)V

    move-object v9, v11

    goto :goto_1

    :pswitch_11
    invoke-static {v3, v1}, Ly3/e;->s0(ILandroid/os/Parcel;)I

    move-result v3

    move v8, v3

    goto :goto_1

    :pswitch_12
    invoke-static {v3, v1}, Ly3/e;->z0(ILandroid/os/Parcel;)I

    move-result v3

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v7

    if-nez v3, :cond_2

    move-object v7, v10

    goto :goto_1

    :cond_2
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v11

    add-int/2addr v7, v3

    invoke-virtual {v1, v7}, Landroid/os/Parcel;->setDataPosition(I)V

    move-object v7, v11

    goto :goto_1

    :pswitch_13
    invoke-static {v3, v1}, Ly3/e;->p0(ILandroid/os/Parcel;)Z

    move-result v3

    move v6, v3

    goto :goto_1

    :pswitch_14
    invoke-static {v3, v1}, Ly3/e;->p0(ILandroid/os/Parcel;)Z

    move-result v3

    move v5, v3

    goto :goto_1

    :pswitch_15
    sget-object v4, Lcom/google/android/gms/common/internal/r;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Ly3/e;->U(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/google/android/gms/common/internal/r;

    goto :goto_1

    :cond_3
    invoke-static {v2, v1}, Ly3/e;->e0(ILandroid/os/Parcel;)V

    new-instance v1, Lcom/google/android/gms/common/internal/i;

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, Lcom/google/android/gms/common/internal/i;-><init>(Lcom/google/android/gms/common/internal/r;ZZ[II[I)V

    return-object v1

    :pswitch_16
    invoke-static/range {p1 .. p1}, Ly3/e;->I0(Landroid/os/Parcel;)I

    move-result v2

    move-object v3, v10

    move-object v4, v3

    :goto_2
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v5

    if-ge v5, v2, :cond_8

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    int-to-char v12, v5

    if-eq v12, v9, :cond_7

    if-eq v12, v8, :cond_6

    if-eq v12, v7, :cond_5

    if-eq v12, v6, :cond_4

    invoke-static {v5, v1}, Ly3/e;->E0(ILandroid/os/Parcel;)V

    goto :goto_2

    :cond_4
    sget-object v4, Lcom/google/android/gms/common/internal/i;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v5, v4}, Ly3/e;->U(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/common/internal/i;

    goto :goto_2

    :cond_5
    invoke-static {v5, v1}, Ly3/e;->s0(ILandroid/os/Parcel;)I

    move-result v5

    move v11, v5

    goto :goto_2

    :cond_6
    sget-object v3, Lz5/d;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v5, v3}, Ly3/e;->X(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Lz5/d;

    goto :goto_2

    :cond_7
    invoke-static {v5, v1}, Ly3/e;->S(ILandroid/os/Parcel;)Landroid/os/Bundle;

    move-result-object v5

    move-object v10, v5

    goto :goto_2

    :cond_8
    invoke-static {v2, v1}, Ly3/e;->e0(ILandroid/os/Parcel;)V

    new-instance v1, Lcom/google/android/gms/common/internal/m0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v10, v1, Lcom/google/android/gms/common/internal/m0;->a:Landroid/os/Bundle;

    iput-object v3, v1, Lcom/google/android/gms/common/internal/m0;->b:[Lz5/d;

    iput v11, v1, Lcom/google/android/gms/common/internal/m0;->c:I

    iput-object v4, v1, Lcom/google/android/gms/common/internal/m0;->d:Lcom/google/android/gms/common/internal/i;

    return-object v1

    :pswitch_17
    invoke-static/range {p1 .. p1}, Ly3/e;->I0(Landroid/os/Parcel;)I

    move-result v2

    move v13, v11

    move v14, v13

    move v15, v14

    move/from16 v16, v15

    move/from16 v17, v16

    :goto_3
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_e

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    if-eq v4, v9, :cond_d

    if-eq v4, v8, :cond_c

    if-eq v4, v7, :cond_b

    if-eq v4, v6, :cond_a

    if-eq v4, v5, :cond_9

    invoke-static {v3, v1}, Ly3/e;->E0(ILandroid/os/Parcel;)V

    goto :goto_3

    :cond_9
    invoke-static {v3, v1}, Ly3/e;->s0(ILandroid/os/Parcel;)I

    move-result v3

    move/from16 v17, v3

    goto :goto_3

    :cond_a
    invoke-static {v3, v1}, Ly3/e;->s0(ILandroid/os/Parcel;)I

    move-result v3

    move/from16 v16, v3

    goto :goto_3

    :cond_b
    invoke-static {v3, v1}, Ly3/e;->p0(ILandroid/os/Parcel;)Z

    move-result v3

    move v15, v3

    goto :goto_3

    :cond_c
    invoke-static {v3, v1}, Ly3/e;->p0(ILandroid/os/Parcel;)Z

    move-result v3

    move v14, v3

    goto :goto_3

    :cond_d
    invoke-static {v3, v1}, Ly3/e;->s0(ILandroid/os/Parcel;)I

    move-result v3

    move v13, v3

    goto :goto_3

    :cond_e
    invoke-static {v2, v1}, Ly3/e;->e0(ILandroid/os/Parcel;)V

    new-instance v1, Lcom/google/android/gms/common/internal/r;

    move-object v12, v1

    invoke-direct/range {v12 .. v17}, Lcom/google/android/gms/common/internal/r;-><init>(IZZII)V

    return-object v1

    :pswitch_18
    invoke-static/range {p1 .. p1}, Ly3/e;->I0(Landroid/os/Parcel;)I

    move-result v2

    move-object v14, v10

    move-object v15, v14

    move v13, v11

    move/from16 v16, v13

    move/from16 v17, v16

    :goto_4
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_14

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    if-eq v4, v9, :cond_13

    if-eq v4, v8, :cond_12

    if-eq v4, v7, :cond_11

    if-eq v4, v6, :cond_10

    if-eq v4, v5, :cond_f

    invoke-static {v3, v1}, Ly3/e;->E0(ILandroid/os/Parcel;)V

    goto :goto_4

    :cond_f
    invoke-static {v3, v1}, Ly3/e;->p0(ILandroid/os/Parcel;)Z

    move-result v3

    move/from16 v17, v3

    goto :goto_4

    :cond_10
    invoke-static {v3, v1}, Ly3/e;->p0(ILandroid/os/Parcel;)Z

    move-result v3

    move/from16 v16, v3

    goto :goto_4

    :cond_11
    sget-object v4, Lz5/b;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Ly3/e;->U(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Lz5/b;

    move-object v15, v3

    goto :goto_4

    :cond_12
    invoke-static {v3, v1}, Ly3/e;->r0(ILandroid/os/Parcel;)Landroid/os/IBinder;

    move-result-object v3

    move-object v14, v3

    goto :goto_4

    :cond_13
    invoke-static {v3, v1}, Ly3/e;->s0(ILandroid/os/Parcel;)I

    move-result v3

    move v13, v3

    goto :goto_4

    :cond_14
    invoke-static {v2, v1}, Ly3/e;->e0(ILandroid/os/Parcel;)V

    new-instance v1, Lcom/google/android/gms/common/internal/a0;

    move-object v12, v1

    invoke-direct/range {v12 .. v17}, Lcom/google/android/gms/common/internal/a0;-><init>(ILandroid/os/IBinder;Lz5/b;ZZ)V

    return-object v1

    :pswitch_19
    invoke-static/range {p1 .. p1}, Ly3/e;->I0(Landroid/os/Parcel;)I

    move-result v2

    move-object v3, v10

    move v4, v11

    :goto_5
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v5

    if-ge v5, v2, :cond_19

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    int-to-char v12, v5

    if-eq v12, v9, :cond_18

    if-eq v12, v8, :cond_17

    if-eq v12, v7, :cond_16

    if-eq v12, v6, :cond_15

    invoke-static {v5, v1}, Ly3/e;->E0(ILandroid/os/Parcel;)V

    goto :goto_5

    :cond_15
    sget-object v3, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v5, v3}, Ly3/e;->U(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    goto :goto_5

    :cond_16
    invoke-static {v5, v1}, Ly3/e;->s0(ILandroid/os/Parcel;)I

    move-result v4

    goto :goto_5

    :cond_17
    sget-object v10, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v5, v10}, Ly3/e;->U(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v5

    check-cast v5, Landroid/accounts/Account;

    move-object v10, v5

    goto :goto_5

    :cond_18
    invoke-static {v5, v1}, Ly3/e;->s0(ILandroid/os/Parcel;)I

    move-result v5

    move v11, v5

    goto :goto_5

    :cond_19
    invoke-static {v2, v1}, Ly3/e;->e0(ILandroid/os/Parcel;)V

    new-instance v1, Lcom/google/android/gms/common/internal/z;

    invoke-direct {v1, v11, v10, v4, v3}, Lcom/google/android/gms/common/internal/z;-><init>(ILandroid/accounts/Account;ILcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V

    return-object v1

    :pswitch_1a
    invoke-static/range {p1 .. p1}, Ly3/e;->I0(Landroid/os/Parcel;)I

    move-result v2

    const/4 v5, -0x1

    move-wide/from16 v16, v3

    move-wide/from16 v18, v16

    move/from16 v23, v5

    move-object/from16 v20, v10

    move-object/from16 v21, v20

    move v13, v11

    move v14, v13

    move v15, v14

    move/from16 v22, v15

    :goto_6
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_1a

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    packed-switch v4, :pswitch_data_3

    invoke-static {v3, v1}, Ly3/e;->E0(ILandroid/os/Parcel;)V

    goto :goto_6

    :pswitch_1b
    invoke-static {v3, v1}, Ly3/e;->s0(ILandroid/os/Parcel;)I

    move-result v3

    move/from16 v23, v3

    goto :goto_6

    :pswitch_1c
    invoke-static {v3, v1}, Ly3/e;->s0(ILandroid/os/Parcel;)I

    move-result v3

    move/from16 v22, v3

    goto :goto_6

    :pswitch_1d
    invoke-static {v3, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v21, v3

    goto :goto_6

    :pswitch_1e
    invoke-static {v3, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v20, v3

    goto :goto_6

    :pswitch_1f
    invoke-static {v3, v1}, Ly3/e;->t0(ILandroid/os/Parcel;)J

    move-result-wide v3

    move-wide/from16 v18, v3

    goto :goto_6

    :pswitch_20
    invoke-static {v3, v1}, Ly3/e;->t0(ILandroid/os/Parcel;)J

    move-result-wide v3

    move-wide/from16 v16, v3

    goto :goto_6

    :pswitch_21
    invoke-static {v3, v1}, Ly3/e;->s0(ILandroid/os/Parcel;)I

    move-result v3

    move v15, v3

    goto :goto_6

    :pswitch_22
    invoke-static {v3, v1}, Ly3/e;->s0(ILandroid/os/Parcel;)I

    move-result v3

    move v14, v3

    goto :goto_6

    :pswitch_23
    invoke-static {v3, v1}, Ly3/e;->s0(ILandroid/os/Parcel;)I

    move-result v3

    move v13, v3

    goto :goto_6

    :cond_1a
    invoke-static {v2, v1}, Ly3/e;->e0(ILandroid/os/Parcel;)V

    new-instance v1, Lcom/google/android/gms/common/internal/p;

    move-object v12, v1

    invoke-direct/range {v12 .. v23}, Lcom/google/android/gms/common/internal/p;-><init>(IIIJJLjava/lang/String;Ljava/lang/String;II)V

    return-object v1

    :pswitch_24
    invoke-static/range {p1 .. p1}, Ly3/e;->I0(Landroid/os/Parcel;)I

    move-result v2

    :goto_7
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_1d

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    if-eq v4, v9, :cond_1c

    if-eq v4, v8, :cond_1b

    invoke-static {v3, v1}, Ly3/e;->E0(ILandroid/os/Parcel;)V

    goto :goto_7

    :cond_1b
    sget-object v4, Lcom/google/android/gms/common/internal/p;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Ly3/e;->Y(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v3

    move-object v10, v3

    goto :goto_7

    :cond_1c
    invoke-static {v3, v1}, Ly3/e;->s0(ILandroid/os/Parcel;)I

    move-result v3

    move v11, v3

    goto :goto_7

    :cond_1d
    invoke-static {v2, v1}, Ly3/e;->e0(ILandroid/os/Parcel;)V

    new-instance v1, Lcom/google/android/gms/common/internal/t;

    invoke-direct {v1, v11, v10}, Lcom/google/android/gms/common/internal/t;-><init>(ILjava/util/List;)V

    return-object v1

    :pswitch_25
    invoke-static/range {p1 .. p1}, Ly3/e;->I0(Landroid/os/Parcel;)I

    move-result v2

    move-object v15, v10

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move v13, v11

    move v14, v13

    :goto_8
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_23

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    if-eq v4, v9, :cond_22

    if-eq v4, v8, :cond_21

    if-eq v4, v7, :cond_20

    if-eq v4, v6, :cond_1f

    const/16 v5, 0x3e8

    if-eq v4, v5, :cond_1e

    invoke-static {v3, v1}, Ly3/e;->E0(ILandroid/os/Parcel;)V

    goto :goto_8

    :cond_1e
    invoke-static {v3, v1}, Ly3/e;->s0(ILandroid/os/Parcel;)I

    move-result v3

    move v13, v3

    goto :goto_8

    :cond_1f
    sget-object v4, Lz5/b;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Ly3/e;->U(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Lz5/b;

    move-object/from16 v17, v3

    goto :goto_8

    :cond_20
    sget-object v4, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Ly3/e;->U(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Landroid/app/PendingIntent;

    move-object/from16 v16, v3

    goto :goto_8

    :cond_21
    invoke-static {v3, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v3

    move-object v15, v3

    goto :goto_8

    :cond_22
    invoke-static {v3, v1}, Ly3/e;->s0(ILandroid/os/Parcel;)I

    move-result v3

    move v14, v3

    goto :goto_8

    :cond_23
    invoke-static {v2, v1}, Ly3/e;->e0(ILandroid/os/Parcel;)V

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    move-object v12, v1

    invoke-direct/range {v12 .. v17}, Lcom/google/android/gms/common/api/Status;-><init>(IILjava/lang/String;Landroid/app/PendingIntent;Lz5/b;)V

    return-object v1

    :pswitch_26
    invoke-static/range {p1 .. p1}, Ly3/e;->I0(Landroid/os/Parcel;)I

    move-result v2

    :goto_9
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_26

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    if-eq v4, v9, :cond_25

    if-eq v4, v8, :cond_24

    invoke-static {v3, v1}, Ly3/e;->E0(ILandroid/os/Parcel;)V

    goto :goto_9

    :cond_24
    invoke-static {v3, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v3

    move-object v10, v3

    goto :goto_9

    :cond_25
    invoke-static {v3, v1}, Ly3/e;->s0(ILandroid/os/Parcel;)I

    move-result v3

    move v11, v3

    goto :goto_9

    :cond_26
    invoke-static {v2, v1}, Ly3/e;->e0(ILandroid/os/Parcel;)V

    new-instance v1, Lcom/google/android/gms/common/api/Scope;

    invoke-direct {v1, v11, v10}, Lcom/google/android/gms/common/api/Scope;-><init>(ILjava/lang/String;)V

    return-object v1

    :pswitch_27
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v1

    new-instance v2, Ly5/h;

    invoke-direct {v2, v1}, Ly5/h;-><init>(Landroid/os/IBinder;)V

    return-object v2

    :pswitch_28
    invoke-static/range {p1 .. p1}, Ly3/e;->I0(Landroid/os/Parcel;)I

    move-result v2

    :goto_a
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_28

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    if-eq v4, v9, :cond_27

    invoke-static {v3, v1}, Ly3/e;->E0(ILandroid/os/Parcel;)V

    goto :goto_a

    :cond_27
    sget-object v4, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Ly3/e;->U(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Landroid/content/Intent;

    goto :goto_a

    :cond_28
    invoke-static {v2, v1}, Ly3/e;->e0(ILandroid/os/Parcel;)V

    new-instance v1, Ly5/a;

    invoke-direct {v1, v10}, Ly5/a;-><init>(Landroid/content/Intent;)V

    return-object v1

    :pswitch_29
    invoke-static/range {p1 .. p1}, Ly3/e;->I0(Landroid/os/Parcel;)I

    move-result v2

    move-wide/from16 v20, v3

    move-object v14, v10

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v22, v19

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move v13, v11

    :goto_b
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_29

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    packed-switch v4, :pswitch_data_4

    invoke-static {v3, v1}, Ly3/e;->E0(ILandroid/os/Parcel;)V

    goto :goto_b

    :pswitch_2a
    invoke-static {v3, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v25, v3

    goto :goto_b

    :pswitch_2b
    invoke-static {v3, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v24, v3

    goto :goto_b

    :pswitch_2c
    sget-object v4, Lcom/google/android/gms/common/api/Scope;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Ly3/e;->Y(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v3

    move-object/from16 v23, v3

    goto :goto_b

    :pswitch_2d
    invoke-static {v3, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v22, v3

    goto :goto_b

    :pswitch_2e
    invoke-static {v3, v1}, Ly3/e;->t0(ILandroid/os/Parcel;)J

    move-result-wide v3

    move-wide/from16 v20, v3

    goto :goto_b

    :pswitch_2f
    invoke-static {v3, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v19, v3

    goto :goto_b

    :pswitch_30
    sget-object v4, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Ly3/e;->U(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Landroid/net/Uri;

    move-object/from16 v18, v3

    goto :goto_b

    :pswitch_31
    invoke-static {v3, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v17, v3

    goto :goto_b

    :pswitch_32
    invoke-static {v3, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v16, v3

    goto :goto_b

    :pswitch_33
    invoke-static {v3, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v3

    move-object v15, v3

    goto :goto_b

    :pswitch_34
    invoke-static {v3, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v3

    move-object v14, v3

    goto :goto_b

    :pswitch_35
    invoke-static {v3, v1}, Ly3/e;->s0(ILandroid/os/Parcel;)I

    move-result v3

    move v13, v3

    goto :goto_b

    :cond_29
    invoke-static {v2, v1}, Ly3/e;->e0(ILandroid/os/Parcel;)V

    new-instance v1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-object v12, v1

    invoke-direct/range {v12 .. v25}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;JLjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :pswitch_36
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    :goto_c
    if-ge v11, v3, :cond_2a

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v11, v11, 0x1

    goto :goto_c

    :cond_2a
    new-instance v1, Lq4/c;

    invoke-direct {v1, v2, v4}, Lq4/c;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    return-object v1

    :pswitch_37
    new-instance v2, Landroidx/versionedparcelable/ParcelImpl;

    invoke-direct {v2, v1}, Landroidx/versionedparcelable/ParcelImpl;-><init>(Landroid/os/Parcel;)V

    return-object v2

    :pswitch_38
    new-instance v2, La4/v0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    iput v3, v2, La4/v0;->a:I

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    iput v3, v2, La4/v0;->b:I

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    iput v3, v2, La4/v0;->c:I

    if-lez v3, :cond_2b

    new-array v3, v3, [I

    iput-object v3, v2, La4/v0;->d:[I

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readIntArray([I)V

    :cond_2b
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    iput v3, v2, La4/v0;->e:I

    if-lez v3, :cond_2c

    new-array v3, v3, [I

    iput-object v3, v2, La4/v0;->f:[I

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readIntArray([I)V

    :cond_2c
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-ne v3, v9, :cond_2d

    move v3, v9

    goto :goto_d

    :cond_2d
    move v3, v11

    :goto_d
    iput-boolean v3, v2, La4/v0;->o:Z

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-ne v3, v9, :cond_2e

    move v3, v9

    goto :goto_e

    :cond_2e
    move v3, v11

    :goto_e
    iput-boolean v3, v2, La4/v0;->p:Z

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-ne v3, v9, :cond_2f

    goto :goto_f

    :cond_2f
    move v9, v11

    :goto_f
    iput-boolean v9, v2, La4/v0;->q:Z

    const-class v3, La4/u0;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, v2, La4/v0;->n:Ljava/util/List;

    return-object v2

    :pswitch_39
    new-instance v2, La4/u0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    iput v3, v2, La4/u0;->a:I

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    iput v3, v2, La4/u0;->b:I

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-ne v3, v9, :cond_30

    goto :goto_10

    :cond_30
    move v9, v11

    :goto_10
    iput-boolean v9, v2, La4/u0;->d:Z

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-lez v3, :cond_31

    new-array v3, v3, [I

    iput-object v3, v2, La4/u0;->c:[I

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readIntArray([I)V

    :cond_31
    return-object v2

    :pswitch_3a
    new-instance v2, La4/r;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    iput v3, v2, La4/r;->a:I

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    iput v3, v2, La4/r;->b:I

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-ne v1, v9, :cond_32

    goto :goto_11

    :cond_32
    move v9, v11

    :goto_11
    iput-boolean v9, v2, La4/r;->c:Z

    return-object v2

    :pswitch_3b
    new-instance v2, Landroidx/fragment/app/d1;

    invoke-direct {v2, v1}, Landroidx/fragment/app/d1;-><init>(Landroid/os/Parcel;)V

    return-object v2

    :pswitch_3c
    new-instance v2, Landroidx/fragment/app/z0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v10, v2, Landroidx/fragment/app/z0;->e:Ljava/lang/String;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v2, Landroidx/fragment/app/z0;->f:Ljava/util/ArrayList;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v2, Landroidx/fragment/app/z0;->n:Ljava/util/ArrayList;

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v3

    iput-object v3, v2, Landroidx/fragment/app/z0;->a:Ljava/util/ArrayList;

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v3

    iput-object v3, v2, Landroidx/fragment/app/z0;->b:Ljava/util/ArrayList;

    sget-object v3, Landroidx/fragment/app/b;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Landroidx/fragment/app/b;

    iput-object v3, v2, Landroidx/fragment/app/z0;->c:[Landroidx/fragment/app/b;

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    iput v3, v2, Landroidx/fragment/app/z0;->d:I

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Landroidx/fragment/app/z0;->e:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v3

    iput-object v3, v2, Landroidx/fragment/app/z0;->f:Ljava/util/ArrayList;

    sget-object v3, Landroidx/fragment/app/c;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v3

    iput-object v3, v2, Landroidx/fragment/app/z0;->n:Ljava/util/ArrayList;

    sget-object v3, Landroidx/fragment/app/u0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, v2, Landroidx/fragment/app/z0;->o:Ljava/util/ArrayList;

    return-object v2

    :pswitch_3d
    new-instance v2, Landroidx/fragment/app/u0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Landroidx/fragment/app/u0;->a:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v2, Landroidx/fragment/app/u0;->b:I

    return-object v2

    :pswitch_3e
    new-instance v2, Landroidx/fragment/app/c;

    invoke-direct {v2, v1}, Landroidx/fragment/app/c;-><init>(Landroid/os/Parcel;)V

    return-object v2

    :pswitch_3f
    new-instance v2, Landroidx/fragment/app/b;

    invoke-direct {v2, v1}, Landroidx/fragment/app/b;-><init>(Landroid/os/Parcel;)V

    return-object v2

    :pswitch_40
    new-instance v2, Le3/j;

    invoke-direct {v2, v1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v2, Le3/j;->a:I

    return-object v2

    :pswitch_41
    new-instance v2, Lm0/m1;

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v3

    invoke-direct {v2, v3, v4}, Lm0/m1;-><init>(J)V

    return-object v2

    :pswitch_42
    new-instance v2, Lm0/l1;

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    invoke-direct {v2, v1}, Lm0/l1;-><init>(I)V

    return-object v2

    :pswitch_43
    new-instance v2, Lm0/k1;

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readFloat()F

    move-result v1

    invoke-direct {v2, v1}, Lm0/k1;-><init>(F)V

    return-object v2

    :pswitch_44
    new-instance v2, La0/c;

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    invoke-direct {v2, v1}, La0/c;-><init>(I)V

    return-object v2

    :pswitch_45
    const-string v2, "inParcel"

    invoke-static {v1, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ld/k;

    const-class v3, Landroid/content/IntentSender;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    invoke-static {v3}, Ld7/a;->j(Ljava/lang/Object;)V

    check-cast v3, Landroid/content/IntentSender;

    const-class v4, Landroid/content/Intent;

    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Landroid/content/Intent;

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    invoke-direct {v2, v3, v4, v5, v1}, Ld/k;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    return-object v2

    :pswitch_46
    new-instance v2, Ld/b;

    invoke-direct {v2, v1}, Ld/b;-><init>(Landroid/os/Parcel;)V

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_f
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ld/a;->a:I

    packed-switch v0, :pswitch_data_0

    new-array p1, p1, [Lcom/google/android/gms/common/internal/j;

    return-object p1

    :pswitch_0
    new-array p1, p1, [Lcom/google/android/gms/common/internal/i;

    return-object p1

    :pswitch_1
    new-array p1, p1, [Lcom/google/android/gms/common/internal/m0;

    return-object p1

    :pswitch_2
    new-array p1, p1, [Lcom/google/android/gms/common/internal/r;

    return-object p1

    :pswitch_3
    new-array p1, p1, [Lcom/google/android/gms/common/internal/a0;

    return-object p1

    :pswitch_4
    new-array p1, p1, [Lcom/google/android/gms/common/internal/z;

    return-object p1

    :pswitch_5
    new-array p1, p1, [Lcom/google/android/gms/common/internal/p;

    return-object p1

    :pswitch_6
    new-array p1, p1, [Lcom/google/android/gms/common/internal/t;

    return-object p1

    :pswitch_7
    new-array p1, p1, [Lcom/google/android/gms/common/api/Status;

    return-object p1

    :pswitch_8
    new-array p1, p1, [Lcom/google/android/gms/common/api/Scope;

    return-object p1

    :pswitch_9
    new-array p1, p1, [Ly5/h;

    return-object p1

    :pswitch_a
    new-array p1, p1, [Ly5/a;

    return-object p1

    :pswitch_b
    new-array p1, p1, [Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    return-object p1

    :pswitch_c
    new-array p1, p1, [Lq4/c;

    return-object p1

    :pswitch_d
    new-array p1, p1, [Landroidx/versionedparcelable/ParcelImpl;

    return-object p1

    :pswitch_e
    new-array p1, p1, [La4/v0;

    return-object p1

    :pswitch_f
    new-array p1, p1, [La4/u0;

    return-object p1

    :pswitch_10
    new-array p1, p1, [La4/r;

    return-object p1

    :pswitch_11
    new-array p1, p1, [Landroidx/fragment/app/d1;

    return-object p1

    :pswitch_12
    new-array p1, p1, [Landroidx/fragment/app/z0;

    return-object p1

    :pswitch_13
    new-array p1, p1, [Landroidx/fragment/app/u0;

    return-object p1

    :pswitch_14
    new-array p1, p1, [Landroidx/fragment/app/c;

    return-object p1

    :pswitch_15
    new-array p1, p1, [Landroidx/fragment/app/b;

    return-object p1

    :pswitch_16
    new-array p1, p1, [Le3/j;

    return-object p1

    :pswitch_17
    new-array p1, p1, [Lm0/m1;

    return-object p1

    :pswitch_18
    new-array p1, p1, [Lm0/l1;

    return-object p1

    :pswitch_19
    new-array p1, p1, [Lm0/k1;

    return-object p1

    :pswitch_1a
    new-array p1, p1, [La0/c;

    return-object p1

    :pswitch_1b
    new-array p1, p1, [Ld/k;

    return-object p1

    :pswitch_1c
    new-array p1, p1, [Ld/b;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
