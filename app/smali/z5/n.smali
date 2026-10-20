.class public final Lz5/n;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lz5/n;->a:I

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 52

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Lz5/n;->a:I

    const/4 v3, 0x5

    const-wide/16 v4, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance v2, Lla/i;

    invoke-direct {v2}, Ljava/lang/Process;-><init>()V

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v1

    sget v3, Lw9/b;->a:I

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v3, "moe.shizuku.server.IRemoteProcess"

    invoke-interface {v1, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v3

    if-eqz v3, :cond_1

    instance-of v4, v3, Lw9/c;

    if-eqz v4, :cond_1

    move-object v11, v3

    check-cast v11, Lw9/c;

    goto :goto_0

    :cond_1
    new-instance v11, Lw9/a;

    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    iput-object v1, v11, Lw9/a;->a:Landroid/os/IBinder;

    :goto_0
    iput-object v11, v2, Lla/i;->a:Lw9/c;

    return-object v2

    :pswitch_0
    new-instance v2, Lmoe/shizuku/api/BinderContainer;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v1

    iput-object v1, v2, Lmoe/shizuku/api/BinderContainer;->a:Landroid/os/IBinder;

    return-object v2

    :pswitch_1
    invoke-static/range {p1 .. p1}, Ly3/e;->I0(Landroid/os/Parcel;)I

    move-result v2

    move-object v3, v11

    :goto_1
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v4

    if-ge v4, v2, :cond_5

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    int-to-char v5, v4

    if-eq v5, v9, :cond_4

    if-eq v5, v8, :cond_3

    if-eq v5, v7, :cond_2

    invoke-static {v4, v1}, Ly3/e;->E0(ILandroid/os/Parcel;)V

    goto :goto_1

    :cond_2
    sget-object v3, Lcom/google/android/gms/common/internal/a0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v4, v3}, Ly3/e;->U(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/common/internal/a0;

    goto :goto_1

    :cond_3
    sget-object v5, Lz5/b;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v4, v5}, Ly3/e;->U(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Lz5/b;

    move-object v11, v4

    goto :goto_1

    :cond_4
    invoke-static {v4, v1}, Ly3/e;->s0(ILandroid/os/Parcel;)I

    move-result v4

    move v10, v4

    goto :goto_1

    :cond_5
    invoke-static {v2, v1}, Ly3/e;->e0(ILandroid/os/Parcel;)V

    new-instance v1, Ln6/h;

    invoke-direct {v1, v10, v11, v3}, Ln6/h;-><init>(ILz5/b;Lcom/google/android/gms/common/internal/a0;)V

    return-object v1

    :pswitch_2
    invoke-static/range {p1 .. p1}, Ly3/e;->I0(Landroid/os/Parcel;)I

    move-result v2

    :goto_2
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_8

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    if-eq v4, v9, :cond_7

    if-eq v4, v8, :cond_6

    invoke-static {v3, v1}, Ly3/e;->E0(ILandroid/os/Parcel;)V

    goto :goto_2

    :cond_6
    sget-object v4, Lcom/google/android/gms/common/internal/z;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Ly3/e;->U(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/common/internal/z;

    move-object v11, v3

    goto :goto_2

    :cond_7
    invoke-static {v3, v1}, Ly3/e;->s0(ILandroid/os/Parcel;)I

    move-result v3

    move v10, v3

    goto :goto_2

    :cond_8
    invoke-static {v2, v1}, Ly3/e;->e0(ILandroid/os/Parcel;)V

    new-instance v1, Ln6/g;

    invoke-direct {v1, v10, v11}, Ln6/g;-><init>(ILcom/google/android/gms/common/internal/z;)V

    return-object v1

    :pswitch_3
    invoke-static/range {p1 .. p1}, Ly3/e;->I0(Landroid/os/Parcel;)I

    move-result v2

    move-object v3, v11

    :goto_3
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v4

    if-ge v4, v2, :cond_b

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    int-to-char v5, v4

    if-eq v5, v9, :cond_a

    if-eq v5, v8, :cond_9

    invoke-static {v4, v1}, Ly3/e;->E0(ILandroid/os/Parcel;)V

    goto :goto_3

    :cond_9
    invoke-static {v4, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v3

    goto :goto_3

    :cond_a
    invoke-static {v4, v1}, Ly3/e;->W(ILandroid/os/Parcel;)Ljava/util/ArrayList;

    move-result-object v4

    move-object v11, v4

    goto :goto_3

    :cond_b
    invoke-static {v2, v1}, Ly3/e;->e0(ILandroid/os/Parcel;)V

    new-instance v1, Ln6/f;

    invoke-direct {v1, v3, v11}, Ln6/f;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    return-object v1

    :pswitch_4
    invoke-static/range {p1 .. p1}, Ly3/e;->I0(Landroid/os/Parcel;)I

    move-result v2

    move v3, v10

    :goto_4
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v4

    if-ge v4, v2, :cond_f

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    int-to-char v5, v4

    if-eq v5, v9, :cond_e

    if-eq v5, v8, :cond_d

    if-eq v5, v7, :cond_c

    invoke-static {v4, v1}, Ly3/e;->E0(ILandroid/os/Parcel;)V

    goto :goto_4

    :cond_c
    sget-object v5, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v4, v5}, Ly3/e;->U(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Landroid/content/Intent;

    move-object v11, v4

    goto :goto_4

    :cond_d
    invoke-static {v4, v1}, Ly3/e;->s0(ILandroid/os/Parcel;)I

    move-result v3

    goto :goto_4

    :cond_e
    invoke-static {v4, v1}, Ly3/e;->s0(ILandroid/os/Parcel;)I

    move-result v4

    move v10, v4

    goto :goto_4

    :cond_f
    invoke-static {v2, v1}, Ly3/e;->e0(ILandroid/os/Parcel;)V

    new-instance v1, Ln6/b;

    invoke-direct {v1, v10, v3, v11}, Ln6/b;-><init>(IILandroid/content/Intent;)V

    return-object v1

    :pswitch_5
    invoke-static/range {p1 .. p1}, Ly3/e;->I0(Landroid/os/Parcel;)I

    move-result v2

    const-wide/32 v7, -0x80000000

    const-string v3, ""

    const/16 v12, 0x64

    move-object/from16 v41, v3

    move-object/from16 v42, v41

    move-object/from16 v48, v42

    move-wide/from16 v18, v4

    move-wide/from16 v20, v18

    move-wide/from16 v28, v20

    move-wide/from16 v30, v28

    move-wide/from16 v37, v30

    move-wide/from16 v45, v37

    move-wide/from16 v50, v45

    move-wide/from16 v25, v7

    move/from16 v23, v9

    move/from16 v33, v23

    move/from16 v24, v10

    move/from16 v32, v24

    move/from16 v34, v32

    move/from16 v44, v34

    move/from16 v49, v44

    move-object v14, v11

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v22, v17

    move-object/from16 v27, v22

    move-object/from16 v35, v27

    move-object/from16 v36, v35

    move-object/from16 v39, v36

    move-object/from16 v40, v39

    move-object/from16 v43, v40

    move/from16 v47, v12

    :goto_5
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_12

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    packed-switch v4, :pswitch_data_1

    :pswitch_6
    invoke-static {v3, v1}, Ly3/e;->E0(ILandroid/os/Parcel;)V

    goto :goto_5

    :pswitch_7
    invoke-static {v3, v1}, Ly3/e;->t0(ILandroid/os/Parcel;)J

    move-result-wide v50

    goto :goto_5

    :pswitch_8
    invoke-static {v3, v1}, Ly3/e;->s0(ILandroid/os/Parcel;)I

    move-result v49

    goto :goto_5

    :pswitch_9
    invoke-static {v3, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v48

    goto :goto_5

    :pswitch_a
    invoke-static {v3, v1}, Ly3/e;->s0(ILandroid/os/Parcel;)I

    move-result v47

    goto :goto_5

    :pswitch_b
    invoke-static {v3, v1}, Ly3/e;->t0(ILandroid/os/Parcel;)J

    move-result-wide v45

    goto :goto_5

    :pswitch_c
    invoke-static {v3, v1}, Ly3/e;->p0(ILandroid/os/Parcel;)Z

    move-result v44

    goto :goto_5

    :pswitch_d
    invoke-static {v3, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v43

    goto :goto_5

    :pswitch_e
    invoke-static {v3, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v42

    goto :goto_5

    :pswitch_f
    invoke-static {v3, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v41

    goto :goto_5

    :pswitch_10
    invoke-static {v3, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v40

    goto :goto_5

    :pswitch_11
    invoke-static {v3, v1}, Ly3/e;->W(ILandroid/os/Parcel;)Ljava/util/ArrayList;

    move-result-object v39

    goto :goto_5

    :pswitch_12
    invoke-static {v3, v1}, Ly3/e;->t0(ILandroid/os/Parcel;)J

    move-result-wide v37

    goto :goto_5

    :pswitch_13
    invoke-static {v3, v1}, Ly3/e;->z0(ILandroid/os/Parcel;)I

    move-result v3

    if-nez v3, :cond_10

    move-object/from16 v36, v11

    goto :goto_5

    :cond_10
    invoke-static {v1, v3, v6}, Ly3/e;->c1(Landroid/os/Parcel;II)V

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-eqz v3, :cond_11

    move v3, v9

    goto :goto_6

    :cond_11
    move v3, v10

    :goto_6
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    move-object/from16 v36, v3

    goto :goto_5

    :pswitch_14
    invoke-static {v3, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v35

    goto :goto_5

    :pswitch_15
    invoke-static {v3, v1}, Ly3/e;->p0(ILandroid/os/Parcel;)Z

    move-result v34

    goto :goto_5

    :pswitch_16
    invoke-static {v3, v1}, Ly3/e;->p0(ILandroid/os/Parcel;)Z

    move-result v33

    goto :goto_5

    :pswitch_17
    invoke-static {v3, v1}, Ly3/e;->s0(ILandroid/os/Parcel;)I

    move-result v32

    goto :goto_5

    :pswitch_18
    invoke-static {v3, v1}, Ly3/e;->t0(ILandroid/os/Parcel;)J

    move-result-wide v30

    goto/16 :goto_5

    :pswitch_19
    invoke-static {v3, v1}, Ly3/e;->t0(ILandroid/os/Parcel;)J

    move-result-wide v28

    goto/16 :goto_5

    :pswitch_1a
    invoke-static {v3, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v27

    goto/16 :goto_5

    :pswitch_1b
    invoke-static {v3, v1}, Ly3/e;->t0(ILandroid/os/Parcel;)J

    move-result-wide v25

    goto/16 :goto_5

    :pswitch_1c
    invoke-static {v3, v1}, Ly3/e;->p0(ILandroid/os/Parcel;)Z

    move-result v24

    goto/16 :goto_5

    :pswitch_1d
    invoke-static {v3, v1}, Ly3/e;->p0(ILandroid/os/Parcel;)Z

    move-result v23

    goto/16 :goto_5

    :pswitch_1e
    invoke-static {v3, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v22

    goto/16 :goto_5

    :pswitch_1f
    invoke-static {v3, v1}, Ly3/e;->t0(ILandroid/os/Parcel;)J

    move-result-wide v20

    goto/16 :goto_5

    :pswitch_20
    invoke-static {v3, v1}, Ly3/e;->t0(ILandroid/os/Parcel;)J

    move-result-wide v18

    goto/16 :goto_5

    :pswitch_21
    invoke-static {v3, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v17

    goto/16 :goto_5

    :pswitch_22
    invoke-static {v3, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v16

    goto/16 :goto_5

    :pswitch_23
    invoke-static {v3, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v15

    goto/16 :goto_5

    :pswitch_24
    invoke-static {v3, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v14

    goto/16 :goto_5

    :cond_12
    invoke-static {v2, v1}, Ly3/e;->e0(ILandroid/os/Parcel;)V

    new-instance v1, Lk6/x7;

    move-object v13, v1

    invoke-direct/range {v13 .. v51}, Lk6/x7;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;ZZJLjava/lang/String;JJIZZLjava/lang/String;Ljava/lang/Boolean;JLjava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJILjava/lang/String;IJ)V

    return-object v1

    :pswitch_25
    invoke-static/range {p1 .. p1}, Ly3/e;->I0(Landroid/os/Parcel;)I

    move-result v2

    move-wide v15, v4

    move v13, v10

    move-object v14, v11

    move-object/from16 v17, v14

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    :goto_7
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_15

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    packed-switch v4, :pswitch_data_2

    invoke-static {v3, v1}, Ly3/e;->E0(ILandroid/os/Parcel;)V

    goto :goto_7

    :pswitch_26
    invoke-static {v3, v1}, Ly3/e;->z0(ILandroid/os/Parcel;)I

    move-result v3

    if-nez v3, :cond_13

    move-object/from16 v21, v11

    goto :goto_7

    :cond_13
    const/16 v4, 0x8

    invoke-static {v1, v3, v4}, Ly3/e;->c1(Landroid/os/Parcel;II)V

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    move-object/from16 v21, v3

    goto :goto_7

    :pswitch_27
    invoke-static {v3, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v20

    goto :goto_7

    :pswitch_28
    invoke-static {v3, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v19

    goto :goto_7

    :pswitch_29
    invoke-static {v3, v1}, Ly3/e;->z0(ILandroid/os/Parcel;)I

    move-result v3

    if-nez v3, :cond_14

    move-object/from16 v18, v11

    goto :goto_7

    :cond_14
    invoke-static {v1, v3, v6}, Ly3/e;->c1(Landroid/os/Parcel;II)V

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readFloat()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    move-object/from16 v18, v3

    goto :goto_7

    :pswitch_2a
    invoke-static {v3, v1}, Ly3/e;->u0(ILandroid/os/Parcel;)Ljava/lang/Long;

    move-result-object v17

    goto :goto_7

    :pswitch_2b
    invoke-static {v3, v1}, Ly3/e;->t0(ILandroid/os/Parcel;)J

    move-result-wide v15

    goto :goto_7

    :pswitch_2c
    invoke-static {v3, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v14

    goto :goto_7

    :pswitch_2d
    invoke-static {v3, v1}, Ly3/e;->s0(ILandroid/os/Parcel;)I

    move-result v13

    goto :goto_7

    :cond_15
    invoke-static {v2, v1}, Ly3/e;->e0(ILandroid/os/Parcel;)V

    new-instance v1, Lk6/t7;

    move-object v12, v1

    invoke-direct/range {v12 .. v21}, Lk6/t7;-><init>(ILjava/lang/String;JLjava/lang/Long;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V

    return-object v1

    :pswitch_2e
    invoke-static/range {p1 .. p1}, Ly3/e;->I0(Landroid/os/Parcel;)I

    move-result v2

    :goto_8
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_19

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v6, v3

    if-eq v6, v9, :cond_18

    if-eq v6, v8, :cond_17

    if-eq v6, v7, :cond_16

    invoke-static {v3, v1}, Ly3/e;->E0(ILandroid/os/Parcel;)V

    goto :goto_8

    :cond_16
    invoke-static {v3, v1}, Ly3/e;->s0(ILandroid/os/Parcel;)I

    move-result v10

    goto :goto_8

    :cond_17
    invoke-static {v3, v1}, Ly3/e;->t0(ILandroid/os/Parcel;)J

    move-result-wide v4

    goto :goto_8

    :cond_18
    invoke-static {v3, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v11

    goto :goto_8

    :cond_19
    invoke-static {v2, v1}, Ly3/e;->e0(ILandroid/os/Parcel;)V

    new-instance v1, Lk6/i7;

    invoke-direct {v1, v11, v4, v5, v10}, Lk6/i7;-><init>(Ljava/lang/String;JI)V

    return-object v1

    :pswitch_2f
    invoke-static/range {p1 .. p1}, Ly3/e;->I0(Landroid/os/Parcel;)I

    move-result v2

    move-wide/from16 v16, v4

    move-object v13, v11

    move-object v14, v13

    move-object v15, v14

    :goto_9
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v4

    if-ge v4, v2, :cond_1e

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    int-to-char v5, v4

    if-eq v5, v8, :cond_1d

    if-eq v5, v7, :cond_1c

    if-eq v5, v6, :cond_1b

    if-eq v5, v3, :cond_1a

    invoke-static {v4, v1}, Ly3/e;->E0(ILandroid/os/Parcel;)V

    goto :goto_9

    :cond_1a
    invoke-static {v4, v1}, Ly3/e;->t0(ILandroid/os/Parcel;)J

    move-result-wide v16

    goto :goto_9

    :cond_1b
    invoke-static {v4, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v15

    goto :goto_9

    :cond_1c
    sget-object v5, Lk6/s;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v4, v5}, Ly3/e;->U(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v4

    move-object v14, v4

    check-cast v14, Lk6/s;

    goto :goto_9

    :cond_1d
    invoke-static {v4, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v13

    goto :goto_9

    :cond_1e
    invoke-static {v2, v1}, Ly3/e;->e0(ILandroid/os/Parcel;)V

    new-instance v1, Lk6/v;

    move-object v12, v1

    invoke-direct/range {v12 .. v17}, Lk6/v;-><init>(Ljava/lang/String;Lk6/s;Ljava/lang/String;J)V

    return-object v1

    :pswitch_30
    invoke-static/range {p1 .. p1}, Ly3/e;->I0(Landroid/os/Parcel;)I

    move-result v2

    :goto_a
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_20

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    if-eq v4, v8, :cond_1f

    invoke-static {v3, v1}, Ly3/e;->E0(ILandroid/os/Parcel;)V

    goto :goto_a

    :cond_1f
    invoke-static {v3, v1}, Ly3/e;->S(ILandroid/os/Parcel;)Landroid/os/Bundle;

    move-result-object v11

    goto :goto_a

    :cond_20
    invoke-static {v2, v1}, Ly3/e;->e0(ILandroid/os/Parcel;)V

    new-instance v1, Lk6/s;

    invoke-direct {v1, v11}, Lk6/s;-><init>(Landroid/os/Bundle;)V

    return-object v1

    :pswitch_31
    invoke-static/range {p1 .. p1}, Ly3/e;->I0(Landroid/os/Parcel;)I

    move-result v2

    :goto_b
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_22

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    if-eq v4, v9, :cond_21

    invoke-static {v3, v1}, Ly3/e;->E0(ILandroid/os/Parcel;)V

    goto :goto_b

    :cond_21
    invoke-static {v3, v1}, Ly3/e;->S(ILandroid/os/Parcel;)Landroid/os/Bundle;

    move-result-object v11

    goto :goto_b

    :cond_22
    invoke-static {v2, v1}, Ly3/e;->e0(ILandroid/os/Parcel;)V

    new-instance v1, Lk6/j;

    invoke-direct {v1, v11}, Lk6/j;-><init>(Landroid/os/Bundle;)V

    return-object v1

    :pswitch_32
    invoke-static/range {p1 .. p1}, Ly3/e;->I0(Landroid/os/Parcel;)I

    move-result v2

    move-wide/from16 v16, v4

    move-wide/from16 v21, v16

    move-wide/from16 v24, v21

    move/from16 v18, v10

    move-object v13, v11

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v19, v15

    move-object/from16 v20, v19

    move-object/from16 v23, v20

    move-object/from16 v26, v23

    :goto_c
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_23

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    packed-switch v4, :pswitch_data_3

    invoke-static {v3, v1}, Ly3/e;->E0(ILandroid/os/Parcel;)V

    goto :goto_c

    :pswitch_33
    sget-object v4, Lk6/v;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Ly3/e;->U(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object/from16 v26, v3

    check-cast v26, Lk6/v;

    goto :goto_c

    :pswitch_34
    invoke-static {v3, v1}, Ly3/e;->t0(ILandroid/os/Parcel;)J

    move-result-wide v24

    goto :goto_c

    :pswitch_35
    sget-object v4, Lk6/v;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Ly3/e;->U(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object/from16 v23, v3

    check-cast v23, Lk6/v;

    goto :goto_c

    :pswitch_36
    invoke-static {v3, v1}, Ly3/e;->t0(ILandroid/os/Parcel;)J

    move-result-wide v21

    goto :goto_c

    :pswitch_37
    sget-object v4, Lk6/v;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Ly3/e;->U(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object/from16 v20, v3

    check-cast v20, Lk6/v;

    goto :goto_c

    :pswitch_38
    invoke-static {v3, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v19

    goto :goto_c

    :pswitch_39
    invoke-static {v3, v1}, Ly3/e;->p0(ILandroid/os/Parcel;)Z

    move-result v18

    goto :goto_c

    :pswitch_3a
    invoke-static {v3, v1}, Ly3/e;->t0(ILandroid/os/Parcel;)J

    move-result-wide v16

    goto :goto_c

    :pswitch_3b
    sget-object v4, Lk6/t7;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Ly3/e;->U(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v15, v3

    check-cast v15, Lk6/t7;

    goto :goto_c

    :pswitch_3c
    invoke-static {v3, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v14

    goto :goto_c

    :pswitch_3d
    invoke-static {v3, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v13

    goto :goto_c

    :cond_23
    invoke-static {v2, v1}, Ly3/e;->e0(ILandroid/os/Parcel;)V

    new-instance v1, Lk6/e;

    move-object v12, v1

    invoke-direct/range {v12 .. v26}, Lk6/e;-><init>(Ljava/lang/String;Ljava/lang/String;Lk6/t7;JZLjava/lang/String;Lk6/v;JLk6/v;JLk6/v;)V

    return-object v1

    :pswitch_3e
    invoke-static/range {p1 .. p1}, Ly3/e;->I0(Landroid/os/Parcel;)I

    move-result v2

    move v3, v10

    move-object v4, v11

    :goto_d
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v5

    if-ge v5, v2, :cond_28

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    int-to-char v12, v5

    if-eq v12, v9, :cond_27

    if-eq v12, v8, :cond_26

    if-eq v12, v7, :cond_25

    if-eq v12, v6, :cond_24

    invoke-static {v5, v1}, Ly3/e;->E0(ILandroid/os/Parcel;)V

    goto :goto_d

    :cond_24
    invoke-static {v5, v1}, Ly3/e;->p0(ILandroid/os/Parcel;)Z

    move-result v3

    goto :goto_d

    :cond_25
    invoke-static {v5, v1}, Ly3/e;->p0(ILandroid/os/Parcel;)Z

    move-result v5

    move v10, v5

    goto :goto_d

    :cond_26
    invoke-static {v5, v1}, Ly3/e;->r0(ILandroid/os/Parcel;)Landroid/os/IBinder;

    move-result-object v4

    goto :goto_d

    :cond_27
    invoke-static {v5, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v5

    move-object v11, v5

    goto :goto_d

    :cond_28
    invoke-static {v2, v1}, Ly3/e;->e0(ILandroid/os/Parcel;)V

    new-instance v1, Lz5/x;

    invoke-direct {v1, v11, v4, v10, v3}, Lz5/x;-><init>(Ljava/lang/String;Landroid/os/IBinder;ZZ)V

    return-object v1

    :pswitch_3f
    invoke-static/range {p1 .. p1}, Ly3/e;->I0(Landroid/os/Parcel;)I

    move-result v2

    move v3, v10

    move v4, v3

    :goto_e
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v5

    if-ge v5, v2, :cond_2d

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    int-to-char v12, v5

    if-eq v12, v9, :cond_2c

    if-eq v12, v8, :cond_2b

    if-eq v12, v7, :cond_2a

    if-eq v12, v6, :cond_29

    invoke-static {v5, v1}, Ly3/e;->E0(ILandroid/os/Parcel;)V

    goto :goto_e

    :cond_29
    invoke-static {v5, v1}, Ly3/e;->s0(ILandroid/os/Parcel;)I

    move-result v4

    goto :goto_e

    :cond_2a
    invoke-static {v5, v1}, Ly3/e;->s0(ILandroid/os/Parcel;)I

    move-result v3

    goto :goto_e

    :cond_2b
    invoke-static {v5, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v5

    move-object v11, v5

    goto :goto_e

    :cond_2c
    invoke-static {v5, v1}, Ly3/e;->p0(ILandroid/os/Parcel;)Z

    move-result v5

    move v10, v5

    goto :goto_e

    :cond_2d
    invoke-static {v2, v1}, Ly3/e;->e0(ILandroid/os/Parcel;)V

    new-instance v1, Lz5/w;

    invoke-direct {v1, v3, v4, v11, v10}, Lz5/w;-><init>(IILjava/lang/String;Z)V

    return-object v1

    :pswitch_40
    invoke-static/range {p1 .. p1}, Ly3/e;->I0(Landroid/os/Parcel;)I

    move-result v2

    move v14, v10

    move v15, v14

    move/from16 v17, v15

    move-object v13, v11

    move-object/from16 v16, v13

    :goto_f
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v4

    if-ge v4, v2, :cond_33

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    int-to-char v5, v4

    if-eq v5, v9, :cond_32

    if-eq v5, v8, :cond_31

    if-eq v5, v7, :cond_30

    if-eq v5, v6, :cond_2f

    if-eq v5, v3, :cond_2e

    invoke-static {v4, v1}, Ly3/e;->E0(ILandroid/os/Parcel;)V

    goto :goto_f

    :cond_2e
    invoke-static {v4, v1}, Ly3/e;->p0(ILandroid/os/Parcel;)Z

    move-result v4

    move/from16 v17, v4

    goto :goto_f

    :cond_2f
    invoke-static {v4, v1}, Ly3/e;->r0(ILandroid/os/Parcel;)Landroid/os/IBinder;

    move-result-object v4

    move-object/from16 v16, v4

    goto :goto_f

    :cond_30
    invoke-static {v4, v1}, Ly3/e;->p0(ILandroid/os/Parcel;)Z

    move-result v4

    move v15, v4

    goto :goto_f

    :cond_31
    invoke-static {v4, v1}, Ly3/e;->p0(ILandroid/os/Parcel;)Z

    move-result v4

    move v14, v4

    goto :goto_f

    :cond_32
    invoke-static {v4, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v4

    move-object v13, v4

    goto :goto_f

    :cond_33
    invoke-static {v2, v1}, Ly3/e;->e0(ILandroid/os/Parcel;)V

    new-instance v1, Lz5/v;

    move-object v12, v1

    invoke-direct/range {v12 .. v17}, Lz5/v;-><init>(Ljava/lang/String;ZZLandroid/os/IBinder;Z)V

    return-object v1

    :pswitch_41
    invoke-static/range {p1 .. p1}, Ly3/e;->I0(Landroid/os/Parcel;)I

    move-result v2

    const-wide/16 v3, -0x1

    :goto_10
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v5

    if-ge v5, v2, :cond_37

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    int-to-char v6, v5

    if-eq v6, v9, :cond_36

    if-eq v6, v8, :cond_35

    if-eq v6, v7, :cond_34

    invoke-static {v5, v1}, Ly3/e;->E0(ILandroid/os/Parcel;)V

    goto :goto_10

    :cond_34
    invoke-static {v5, v1}, Ly3/e;->t0(ILandroid/os/Parcel;)J

    move-result-wide v3

    goto :goto_10

    :cond_35
    invoke-static {v5, v1}, Ly3/e;->s0(ILandroid/os/Parcel;)I

    move-result v5

    move v10, v5

    goto :goto_10

    :cond_36
    invoke-static {v5, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v5

    move-object v11, v5

    goto :goto_10

    :cond_37
    invoke-static {v2, v1}, Ly3/e;->e0(ILandroid/os/Parcel;)V

    new-instance v1, Lz5/d;

    invoke-direct {v1, v11, v3, v4, v10}, Lz5/d;-><init>(Ljava/lang/String;JI)V

    return-object v1

    :pswitch_42
    invoke-static/range {p1 .. p1}, Ly3/e;->I0(Landroid/os/Parcel;)I

    move-result v2

    move v3, v10

    move-object v4, v11

    :goto_11
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v5

    if-ge v5, v2, :cond_3c

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    int-to-char v12, v5

    if-eq v12, v9, :cond_3b

    if-eq v12, v8, :cond_3a

    if-eq v12, v7, :cond_39

    if-eq v12, v6, :cond_38

    invoke-static {v5, v1}, Ly3/e;->E0(ILandroid/os/Parcel;)V

    goto :goto_11

    :cond_38
    invoke-static {v5, v1}, Ly3/e;->V(ILandroid/os/Parcel;)Ljava/lang/String;

    move-result-object v4

    goto :goto_11

    :cond_39
    sget-object v11, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v5, v11}, Ly3/e;->U(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v5

    check-cast v5, Landroid/app/PendingIntent;

    move-object v11, v5

    goto :goto_11

    :cond_3a
    invoke-static {v5, v1}, Ly3/e;->s0(ILandroid/os/Parcel;)I

    move-result v3

    goto :goto_11

    :cond_3b
    invoke-static {v5, v1}, Ly3/e;->s0(ILandroid/os/Parcel;)I

    move-result v5

    move v10, v5

    goto :goto_11

    :cond_3c
    invoke-static {v2, v1}, Ly3/e;->e0(ILandroid/os/Parcel;)V

    new-instance v1, Lz5/b;

    invoke-direct {v1, v10, v3, v11, v4}, Lz5/b;-><init>(IILandroid/app/PendingIntent;Ljava/lang/String;)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_25
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_6
        :pswitch_15
        :pswitch_14
        :pswitch_6
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
        :pswitch_6
        :pswitch_7
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x2
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lz5/n;->a:I

    packed-switch v0, :pswitch_data_0

    new-array p1, p1, [Lla/i;

    return-object p1

    :pswitch_0
    new-array p1, p1, [Lmoe/shizuku/api/BinderContainer;

    return-object p1

    :pswitch_1
    new-array p1, p1, [Ln6/h;

    return-object p1

    :pswitch_2
    new-array p1, p1, [Ln6/g;

    return-object p1

    :pswitch_3
    new-array p1, p1, [Ln6/f;

    return-object p1

    :pswitch_4
    new-array p1, p1, [Ln6/b;

    return-object p1

    :pswitch_5
    new-array p1, p1, [Lk6/x7;

    return-object p1

    :pswitch_6
    new-array p1, p1, [Lk6/t7;

    return-object p1

    :pswitch_7
    new-array p1, p1, [Lk6/i7;

    return-object p1

    :pswitch_8
    new-array p1, p1, [Lk6/v;

    return-object p1

    :pswitch_9
    new-array p1, p1, [Lk6/s;

    return-object p1

    :pswitch_a
    new-array p1, p1, [Lk6/j;

    return-object p1

    :pswitch_b
    new-array p1, p1, [Lk6/e;

    return-object p1

    :pswitch_c
    new-array p1, p1, [Lz5/x;

    return-object p1

    :pswitch_d
    new-array p1, p1, [Lz5/w;

    return-object p1

    :pswitch_e
    new-array p1, p1, [Lz5/v;

    return-object p1

    :pswitch_f
    new-array p1, p1, [Lz5/d;

    return-object p1

    :pswitch_10
    new-array p1, p1, [Lz5/b;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
