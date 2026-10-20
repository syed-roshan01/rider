.class public final synthetic Lk6/f1;
.super Ljava/lang/Object;

# interfaces
.implements Lk6/w3;


# static fields
.field public static final a:Lk6/f1;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lk6/f1;

    invoke-direct {v0}, Lk6/f1;-><init>()V

    sput-object v0, Lk6/f1;->a:Lk6/f1;

    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lb/۠ۨۦۥ;->۟ۧۢۥۢ()Ljava/util/List;

    invoke-static {}, Lcom/google/firebase/firestore/ktx/ۢ۠ۢۧ;->۟ۡۡۨۢ()J

    move-result-wide v0

    invoke-static {v0, v1}, Lu8/ۨۡ۠;->۟ۥ۠ۧ(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method
