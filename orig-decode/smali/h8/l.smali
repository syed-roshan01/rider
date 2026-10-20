.class public final Lh8/l;
.super Lg8/b;


# static fields
.field public static final r:Lja/g;


# instance fields
.field public final j:Le8/p1;

.field public final k:Ljava/lang/String;

.field public final l:Lg8/y5;

.field public m:Ljava/lang/String;

.field public final n:Lh8/k;

.field public final o:Lk6/w4;

.field public final p:Le8/c;

.field public q:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lja/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lh8/l;->r:Lja/g;

    return-void
.end method

.method public constructor <init>(Le8/p1;Le8/l1;Lh8/e;Lh8/n;Ly5/o;Ljava/lang/Object;IILjava/lang/String;Ljava/lang/String;Lg8/y5;Lg8/e6;Le8/h;Z)V
    .locals 11

    move-object v9, p0

    move-object v7, p1

    new-instance v1, La4/q;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 v8, 0x0

    if-eqz p14, :cond_0

    iget-boolean v0, v7, Le8/p1;->h:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    move v6, v0

    goto :goto_0

    :cond_0
    move v6, v8

    :goto_0
    move-object v0, p0

    move-object/from16 v2, p11

    move-object/from16 v3, p12

    move-object v4, p2

    move-object/from16 v5, p13

    invoke-direct/range {v0 .. v6}, Lg8/b;-><init>(La4/q;Lg8/y5;Lg8/e6;Le8/l1;Le8/h;Z)V

    new-instance v0, Lk6/w4;

    const/16 v1, 0x14

    invoke-direct {v0, p0, v1}, Lk6/w4;-><init>(Ljava/lang/Object;I)V

    iput-object v0, v9, Lh8/l;->o:Lk6/w4;

    iput-boolean v8, v9, Lh8/l;->q:Z

    move-object/from16 v3, p11

    iput-object v3, v9, Lh8/l;->l:Lg8/y5;

    iput-object v7, v9, Lh8/l;->j:Le8/p1;

    move-object/from16 v0, p9

    iput-object v0, v9, Lh8/l;->m:Ljava/lang/String;

    move-object/from16 v0, p10

    iput-object v0, v9, Lh8/l;->k:Ljava/lang/String;

    move-object v8, p4

    iget-object v0, v8, Lh8/n;->u:Le8/c;

    iput-object v0, v9, Lh8/l;->p:Le8/c;

    new-instance v10, Lh8/k;

    iget-object v0, v7, Le8/p1;->b:Ljava/lang/String;

    move-object v0, v10

    move-object v1, p0

    move/from16 v2, p7

    move-object/from16 v3, p11

    move-object/from16 v4, p6

    move-object v5, p3

    move-object/from16 v6, p5

    move-object v7, p4

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lh8/k;-><init>(Lh8/l;ILg8/y5;Ljava/lang/Object;Lh8/e;Ly5/o;Lh8/n;I)V

    iput-object v10, v9, Lh8/l;->n:Lh8/k;

    return-void
.end method


# virtual methods
.method public final m(Ljava/lang/String;)V
    .locals 1

    const-string v0, "authority"

    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Lh8/l;->m:Ljava/lang/String;

    return-void
.end method

.method public final p()Le8/c;
    .locals 1

    iget-object v0, p0, Lh8/l;->p:Le8/c;

    return-object v0
.end method

.method public final y()Lh8/k;
    .locals 1

    iget-object v0, p0, Lh8/l;->n:Lh8/k;

    return-object v0
.end method
